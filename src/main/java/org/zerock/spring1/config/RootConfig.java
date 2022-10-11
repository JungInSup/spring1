package org.zerock.spring1.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.zerock.spring1.service", "org.zerock.spring1.dao", "org.zerock.spring1.test"})
@MapperScan(basePackages = {"org.zerock.spring1.mapper"})
public class RootConfig {

   // 개발기간이 끝남 개발이 덜됨 
   // 1. 기간을 연장하고 개발을 더 하는가.
   // 2. 최소한의 개발을 해서 오픈을 먼저 하는방법


   // Bean을 직접 생성하는 것도 있고,
   // 저절로 Bean이 생성이 되게 하는 경우도 있다.

   @Bean
    public HikariConfig hikariConfig() {

       HikariConfig config = new HikariConfig();
       config.setDriverClassName("org.mariadb.jdbc.Driver");
       config.setJdbcUrl("jdbc:mariadb://127.0.0.1/tbl_todo3");
       config.setUsername("todouser_3");
       config.setPassword("todouser_3");
       config.addDataSourceProperty("cachePrepStmts", "true");
       config.addDataSourceProperty("prepStmtCacheSize", "250");
       config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

       return config;
   }

   // 내가 만든 코드가 아니라서 설정파일에서 Bean으로 연결한다.
   @Bean
    public DataSource dataSource() {

       // Bean을 집어 넣는다.
       return new HikariDataSource(hikariConfig());
   }

   @Bean
   public SqlSessionFactory sqlSessionFactory() throws Exception {

      SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
      factoryBean.setDataSource(dataSource());
      return factoryBean.getObject();
   }

}



