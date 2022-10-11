package org.zerock.spring1;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.spring1.mapper.TodoMapper;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {org.zerock.spring1.config.RootConfig.class})
//@ContextConfiguration(locations = "TimeMapper.xml")
@Log4j2
public class TodoMapperTests {

    @Autowired(required = false)
    TodoMapper todoMapper;

    @Test
    public void test() {

        log.info(todoMapper.selectAll());

    }

}
