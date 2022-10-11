package org.zerock.spring1.dao;

import org.springframework.stereotype.Repository;
import org.zerock.spring1.dto.TodoDTO;

// DB쪽은 Repository를 붙여준다.
// package를 등록해줘야 빈을 만들 수 있다..
@Repository
public class TodoDAOImpl1 implements TodoDAO{

    @Override
    public String doA() {
        return null;
    }

    @Override
    public void insert(TodoDTO todoDTO) {

    }
}
