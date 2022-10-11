package org.zerock.spring1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.zerock.spring1.controller.convert.LocalDateConverter;

// serblet-contxt.xml을 대신한다.
// web과 관련된 모든것들이 들어간다.
// web을 돌릴때 쓰는것이 EnableWebMvc 이다.

// Enable이 없을때 오류, gradle jstl이 없을때 오류를 알아야 한다.
@EnableWebMvc
@ComponentScan(basePackages = "org.zerock.spring1.controller")
public class ZerockServletConfig implements WebMvcConfigurer {

    // resources에 파일을 다룬다.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/res/**").addResourceLocations("/resources/");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {

        registry.addConverter(new LocalDateConverter());
    }

    //    @Override
//    public void addFormatters(FormatterRegistrar registry) {
//        registry.addConverter(new LocalDateConverter());
//    }

    // view를 설정 해준다.
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        // jsp를 쓸꺼냐 다른것을 쓸꺼냐
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);


    }
}
