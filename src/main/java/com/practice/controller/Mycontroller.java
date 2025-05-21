package com.practice.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {
	
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("inside about handler");
		
		//putting data in model
		model.addAttribute("name", "nitya");
		model.addAttribute("currentDate", new Date().toLocaleString());
		
		return "about";
	}

}
