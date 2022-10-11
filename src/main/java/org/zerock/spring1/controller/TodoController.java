package org.zerock.spring1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.spring1.dto.PageRequestDTO;
import org.zerock.spring1.dto.TodoDTO;

@Controller
// todo로 들어오면 다 받아먹는다.
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    // request.setAttribute 대신에 Model을 쓴다.
    // Model 이라는 것은 무엇인가를 전달할때 쓴다. (override는 없고, reflection이 있다.)

    // /todo/list로 만들어진다.
    @GetMapping("/list")
    public void list(Model model) {

        log.info("Todo List..............................................................");
        model.addAttribute("result", "Hello World");
    }

    // void 는 views밑에 todo밑에 register.jsp이다.
    @GetMapping("/register")
    public void register() {


    }

    @PostMapping("/register")
    public String registerPost(TodoDTO todoDTO, RedirectAttributes rttr) {

        rttr.addAttribute("result1", "aaaa");
        rttr.addFlashAttribute("result2", "bbbbb");

        //log.info("Todo List.......................");
        //log.info("page : " + pageRequestDTO);
        log.info(todoDTO);

        // redirect랑 같은 개념
        return "redirect:/todo/list";
    }
}
