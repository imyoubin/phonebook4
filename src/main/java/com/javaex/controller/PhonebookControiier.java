package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhonebookControiier {
	

	@RequestMapping(value="/list",method= {RequestMethod.GET,RequestMethod.POST})
	public String list() {
		
		System.out.println("list");
		
		return "";
	}
	
	@RequestMapping(value="/wfrom",method= {RequestMethod.GET,RequestMethod.POST})
	public String wfrom() {
		
		System.out.println("wfrom");
		
		return "";
	}
	
	@RequestMapping(value="/mfrom",method= {RequestMethod.GET,RequestMethod.POST})
	public String mfrom() {
		
		System.out.println("mfrom");
		
		return "";
	}

}
