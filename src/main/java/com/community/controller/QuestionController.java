package com.community.controller;

import com.community.dto.QuestionDTO;
import com.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * QuestionController class
 *
 * @author: Administrator
 * @date: 2019/9/16 10:10
 * Description:
 */
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("question/{id}")
    public String question(@PathVariable(name="id") Integer id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}
