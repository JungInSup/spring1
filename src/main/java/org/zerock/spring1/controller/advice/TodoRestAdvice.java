package org.zerock.spring1.controller.advice;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.zerock.spring1.controller.exception.TodoException;

// 예외처리는 깔끔하게 전달을 해야 한다.
// Rest에서 예외 사용을 할 수 있다.
@RestControllerAdvice
@Log4j2
public class TodoRestAdvice {

    // exception이 제대로 일어나는가.
    // exception이 일어나면 메세지를 보내줄 수 있어야 한다.
    // Json쪽에서 데이터가 없으면 화면이 존재하지 않으므로 메세지를 보내줘야 한다.

    @ExceptionHandler(TodoException.class)
    public ResponseEntity<String> checkException(TodoException todoException) {

        log.info("++++++++++++++++TodoRestAdvice+++++++++++");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(todoException.getMsg());
    }


}
