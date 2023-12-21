package com.fev.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fev.shop.service.LoginService;
import com.fev.shop.vo.Emp;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	@Autowired private LoginService loginService;
	
	// 로그인 Get
	@GetMapping("/login")
	public String login() {
		
		return "login";
		
	}
	
	// 로그아웃 Get
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/login";
		
	}
	
	// 로그인 라디오 선택 Post
	@PostMapping("/login")
	public String login(Model model,
							@RequestParam(value = "user", defaultValue = "emp") String user) {
		
		model.addAttribute("user", user);
		
		return "login";
		
	}
	
	// 로그인 Emp
	@PostMapping("/loginEmp")
	public String loginEmp(HttpSession session, Emp paramEmp) {
		
		String targetUrl = "redirect:/login";	// 로그인 실패시 페이지
		
		Emp emp = loginService.loginEmp(paramEmp);
		
		if(emp != null) {
			
			session.setAttribute("loginEmp", emp);
			
			targetUrl = "redirect:/emp/main";	// 로그인 성공시 페이지
		}
		
		return targetUrl;
		
	}
	
	// 로그인 후 메인페이지 Emp
	@GetMapping("/emp/main")
	public String mainEmp(HttpSession session) {
		
		return "emp/mainEmp";
	
	}
	
}
