package org.zerock.spring1.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.spring1.dao.TodoDAOImpl1;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.spring1.config.RootConfig.class})
//@ContextConfiguration(locations = "TimeMapper.xml")
@Log4j2
public class TimeMapperTests {

    // Bean의 구현체를 만들어야 한다.
    //@Autowired(required = false) => 체크가 필요하지 않다.

    @Autowired(required = false)
    TimeMapper timeMapper;

    @Autowired
    TodoDAOImpl1 todoDAOImpl1;

    @Test
    public void testTime() {
        log.info(timeMapper);
//        log.info(timeMapper.getClass().getName());
//        log.info(timeMapper.getTime());
    }


    @Test
    public void testTime2() {
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime2());
    }

    @Test
    public void testImpl1(){
        log.info(todoDAOImpl1.doA());
    }

}
