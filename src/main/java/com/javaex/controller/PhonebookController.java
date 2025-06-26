package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVO;

@Controller
public class PhonebookController {

	//필드
	@Autowired
	private PhonebookService phonebookService;
	
	
	//메소드 일반
	
	//--전체리스트
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("PhonebookController.list()");
		
		List<PersonVO> personList = phonebookService.exeList();

		model.addAttribute("personList", personList);
		
		/*
		포워드
		/WEB-INF/views/list.jsp  -->  /WEB-INF/views/ +  list + .jsp
		*/
		return "list";
	}
	
	
	//--수정폼
	@RequestMapping(value="/mform", method= {RequestMethod.GET, RequestMethod.POST})
	public String modifyForm(@RequestParam(value="no") int personId, Model model) {
		System.out.println("PhonebookController.modifyForm()");
		
		PersonVO personVO = phonebookService.exeModifyForm(personId);
		
		model.addAttribute("personVO", personVO);
		
		return "modifyForm";
	}
	
	
	//--등록
	@RequestMapping(value="/add", method= {RequestMethod.GET, RequestMethod.POST})
	public String add(@ModelAttribute PersonVO personVO) {
		System.out.println("PhonebookController.add()");
		
		phonebookService.exeAdd(personVO);
		http://localhost:8888/p4/list

		return "";
	}
		
}