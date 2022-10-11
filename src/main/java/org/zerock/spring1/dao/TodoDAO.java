package org.zerock.spring1.dao;


import org.zerock.spring1.dto.TodoDTO;

public interface TodoDAO {

    String doA();

    void insert(TodoDTO todoDTO);
}
