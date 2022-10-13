package org.zerock.spring1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import org.zerock.spring1.controller.exception.TodoException;
import org.zerock.spring1.dto.PageRequestDTO;
import org.zerock.spring1.dto.PageResponseDTO;
import org.zerock.spring1.dto.TodoDTO;
import org.zerock.spring1.service.TodoService;

// REST 방법 @RestController
@RestController
@Log4j2
@RequiredArgsConstructor
public class SampleController {

    // 의존성 주입
    private final TodoService todoService;


    @GetMapping("/ex1")
    public String[] getArr() {

        return new String[]{"AAAA", "BBBB", "CCCC"};
    }

    /*
        Json 데이터를 TodoDTO로 바꿔준다.
        @RequestBody TodoDTO todoDTO
    */

    @PostMapping("/ex2")
    public String[] getArr2(@RequestBody TodoDTO todoDTO) {

        log.info(todoDTO);

        return new String[]{"AAAA", "BBBB", "CCCC"};
    }

    @GetMapping("/exList")
    public PageResponseDTO<TodoDTO> getList() {

        return todoService.getList(PageRequestDTO.builder().build());
    }

    @GetMapping("/exRead/{tno}")
    public TodoDTO read(@PathVariable("tno") Long tno) throws TodoException {

        log.info("TNO : " + tno);
        TodoDTO dto = todoService.read(tno);

        if(dto == null) {
            throw new TodoException(404, "NOT EXIST");
        }

        return dto;
   }
}
