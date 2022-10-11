package org.zerock.spring1;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.spring1.dao.TodoDAO;
import org.zerock.spring1.service.TodoService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.spring1.config.RootConfig.class})
@Log4j2
public class ConfigTests {

    // 콩 옆에 화살표 모양은 '주입' 이다.

    // service 객체 등장!
    @Autowired
    TodoService service;

    // todoDAO 객체 등장!
    @Autowired
    TodoDAO todoDAO;

    @Test
    public void test1() {

        // null이면 문제가 생김?
        Assertions.assertNotNull(service);

        log.info("================================");

        Assertions.assertNotNull(todoDAO);

        log.info("================================");

        log.info(service);
        log.info(todoDAO);


        // 객체가 만들어진 값을 확인
        // @6831d8fd => 해쉬코드
        //System.out.println(todoDAO);

        // 동일한 객체를 우리한테 내려준다.
        // @6831d8fd => 해쉬코드
        //System.out.println(service);
    }
}
