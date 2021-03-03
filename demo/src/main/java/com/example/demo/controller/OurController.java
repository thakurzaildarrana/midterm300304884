package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.OurModel;


@Controller
public class OurController {
	
	private OurModel om;
	
	@RequestMapping("/joke")
	public String Jokes() {
		
		return "index";
	}
	
	@RequestMapping("/jokes")
	public String mycontroller(@ModelAttribute ("joke") Model model) {
		
		model.addAttribute("joke", om);
		return "index";
	}

}
