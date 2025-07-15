package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVO;

@Controller
public class PhonebookController {

    @Autowired
    private PhonebookService phonebookService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<PersonVO> personList = phonebookService.exeList();
        model.addAttribute("personList", personList);
        return "list";
    }
}
