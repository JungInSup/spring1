package org.zerock.spring1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.spring1.mapper.TimeMapper;

@Service
@Log4j2
@RequiredArgsConstructor
public class TimeServiceImpl implements TimeService{

    // final로 해야 생성자를 만들면서 의존성 주입이 일어남
    private final TimeMapper timeMapper;


    @Override
    public void addAll(String str) {

        log.info("--------------------------------t1 insert");
        timeMapper.addT1(str);

        log.info("--------------------------------t2 insert");
        timeMapper.addT2(str);

    }
}
