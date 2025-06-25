package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVO;

@Controller

public class PhonebookController {
	
	//필드
		@Autowired
	    private  PhonebookService  phonebookService;
		
		
		//-방명록 전체 리스트 가져오기
		@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
		public String list(Model model) {
			System.out.println("PhonebookController.list()");
			
			
			// PhonebookService  phonebookService = new  PhonebookService();
			
			List<PersonVO> phonebookList =  phonebookService.exeGetPhonebookList();
			
			
			model.addAttribute("pList", phonebookList);
			
			
			return "list";
			
		}
		
		@RequestMapping(value="add", method= {RequestMethod.GET, RequestMethod.POST})
		public String add(@ModelAttribute PersonVO personVO) {
			           
			System.out.println("PhonebookController.add()");
		}
		
}