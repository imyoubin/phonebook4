package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.PhonebookDAO;
import com.javaex.vo.PersonVO;

@Controller
public class PhonebookControiier {
	
	//폰북 리스트	
		@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
		public String list(Model model) {
			System.out.println("PhonebookControiier.list()");

			PhonebookDAO phonebookDAO = new PhonebookDAO();
			List<PersonVO> phonebookList = phonebookDAO.personSelect();
			model.addAttribute("pList", phonebookList);

			/*.application.properties 설정(#view resolve
			spring.mvc.view.prefix=/WEB-INF/views/
			spring.mvc.view.suffix=.jsp
			*/
			return "list";  
		}

		//등록폼 
		@RequestMapping(value="/wform", method=RequestMethod.GET)
		public String writeform() {
			System.out.println("PhonebookControiier.writeform()");
			
			/*.application.properties 설정(#view resolve
			spring.mvc.view.prefix=/WEB-INF/views/
			spring.mvc.view.suffix=.jsp
			*/
			return "writeForm";  
		}

		//등록 
		@RequestMapping(value="/insert", method=RequestMethod.POST)
		public String insert(@ModelAttribute PersonVO personVO) {
			System.out.println("PhonebookControiier.insert()");
			System.out.println(personVO);

			PhonebookDAO phonebookDAO = new PhonebookDAO();
			int count = phonebookDAO.personInsert(personVO);

			//주소(url)
			return "redirect:/list";
		}
	}