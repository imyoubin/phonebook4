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
	    private  PhonebookService  phonebookService;
		
		
		//폰북 전체 리스트
		@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
		public String list(Model model) {
			System.out.println("PhonebookController.list()");
			
			
			// PhonebookService  phonebookService = new  PhonebookService();
			
			List<PersonVO> phonebookList =  phonebookService.exeGetPhonebookList();
			
			
			model.addAttribute("pList", phonebookList);
			
			
			return "list";
			
		}
		
		//폰북 저장
		@RequestMapping(value="add", method= {RequestMethod.GET, RequestMethod.POST})
		public String add(@ModelAttribute PersonVO personVO) {
			           
			System.out.println("PhonebookController.add()");
			
			phonebookService.exePhonebookAdd(personVO);
			
			return "redirect:/list";
		}
		
		//삭제폼
		@RequestMapping(value = "/removeForm", method = {RequestMethod.GET, RequestMethod.POST})
		public String removeForm(@RequestParam("personId") int personId, Model model) {
		    System.out.println("PhonebookController.removeForm()");

		    model.addAttribute("personId", personId);  
		    return "removeform";
		}
		
		//삭제
		@RequestMapping(value="/remove", method= {RequestMethod.GET, RequestMethod.POST})
		public String remove(@ModelAttribute PersonVO personVO) {
			System.out.println("GuestbookController.remove()");
						
			phonebookService.exePhonebookRemove(personVO);
			
			return "redirect:/list";
		}
		//등록폼
		@RequestMapping(value = "/wform", method = RequestMethod.GET)
		public String writeForm() {
		    System.out.println("PhonebookController.writeForm()");
		    
		    return "wform";  
		}
		//등록
		    @RequestMapping(value = "/insert", method = RequestMethod.POST)
		    public String insert(@ModelAttribute PersonVO personVO) {
		        System.out.println("PhonebookController.insert()");
		        
		        phonebookService.exePhonebookAdd(personVO);
		        
		        return "redirect:/phonebook4/list";
		    }    
		
		
		//수정폼		
		@RequestMapping(value="/updateForm", method = {RequestMethod.GET, RequestMethod.POST})
		public String updateForm(@RequestParam("personId") int personId, Model model) {
		    System.out.println("PhonebookController.updateForm()"); 
		    		    
		    return "updateForm"; 
		}
		
		//수정		
	    @RequestMapping(value = "/update", method = RequestMethod.POST)
	    public String update(@ModelAttribute PersonVO personVO) {
	        System.out.println("PhonebookController.update()");
	        
	        phonebookService.exePhonebookUpdate(personVO);

	        return "redirect:/list";
	    }
		
}