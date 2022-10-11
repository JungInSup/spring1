package org.zerock.spring1.service;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.spring1.dao.TodoDAO;
import org.zerock.spring1.dto.TodoDTO;

//application context가 하는일을 공부하면 spring이 이해가 된다.
@Service
// 생성자를 만들어줘야 하는데 lombok에 @RequiredArgsConstructor을 통하여 생성자를 만들어준다.
@RequiredArgsConstructor
@Log4j2
@ToString
public class TodoServiceImpl implements TodoService{

    private final TodoDAO todoDAO;

    @Override
    public void register(TodoDTO todoDTO) {

        todoDAO.insert(todoDTO);
    }
}
