package org.zerock.spring1.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.spring1.config.RootConfig.class})
//@ContextConfiguration(locations = "TimeMapper.xml")
@Log4j2
public class SampleSerivceTests {

    @Autowired
    private  TimeService timeService;

    @Test
    public void testInsert() {

        timeService.addAll("우리는 민족 중흥의 역사적 사명을 띄고 이땅에 태어났다. 조상의 빛나는......");
    }
}
