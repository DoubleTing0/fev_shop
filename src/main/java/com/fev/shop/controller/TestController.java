package com.fev.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fev.shop.service.TestService;
import com.fev.shop.util.TeamColor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {
	
	@Autowired private TestService testService;
	
	@GetMapping("/test")
	public String main(Model model) {
		
		String empName = testService.testService("admin");
		
		log.debug(TeamColor.RED + empName);
		model.addAttribute("empName", empName);
		
		
		log.debug(TeamColor.RED + "test");
		return "test/test";
		
	}	

}
