package org.zerock.spring1;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.spring1.test.test;

@ExtendWith(SpringExtension.class)
@Log4j2
public class testtest {

    @Autowired
    test test;

    @Test
    public void test() {

        log.info(test.dotest());
    }
}
