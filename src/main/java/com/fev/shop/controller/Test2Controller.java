package com.fev.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test2Controller {
	
	@GetMapping("/test2")
	public String main(Model model) {
		
		return "test/test2";
		
	}	

}