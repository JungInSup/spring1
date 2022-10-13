package org.zerock.spring1.controller;

import com.sun.tools.javac.comp.Todo;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.spring1.dto.TodoAddDTO;
import org.zerock.spring1.dto.TodoDTO;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/todo2")
@Log4j2
public class TodoValidController {

    @PostMapping("/register")
    public String registerPOST(@Valid TodoAddDTO todoDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        log.info("-------------------");
        log.info("-------------------");
        log.info(bindingResult);

        if(bindingResult.hasErrors()){
            log.info("ERROR......................");

            List<ObjectError> errorList = bindingResult.getAllErrors();

            redirectAttributes.addFlashAttribute("errors", errorList);

            return "redirect:/todo/register";

        }

        log.info(todoDTO);
        log.info("-------------------");

        return "redirect:/todo/list";

    }

}
