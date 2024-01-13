package com.fev.shop.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fev.shop.service.JoinService;
import com.fev.shop.util.TeamColor;
import com.fev.shop.vo.*;

import ch.qos.logback.classic.Logger;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JoinController {

	@Autowired private JoinService joinService;
	
	// 회원가입
	@GetMapping("/joinCustomer")
	public String join() {
		return "join";
	}

	// 회원가입 등록
	@PostMapping("/joinForm")
	public String loginEmp(HttpSession session, Customer paramCustomer
							,@RequestParam(value="joinId") String joinId
							,@RequestParam(value="joinPw") String joinPw
							,@RequestParam(value="joinName") String joinName
							,@RequestParam(value="joinPhone") String joinPhone
							) {
		
		String targetUrl = "redirect:/joinCustomer";	// 로그인 실패시 페이지
		
		//Emp emp = loginService.loginEmp(paramEmp);
		paramCustomer.setCustomer_id(joinId);
		paramCustomer.setCustomer_pw(joinPw);
		paramCustomer.setCustomer_name(joinName);
		paramCustomer.setCustomer_phone(joinPhone);
		
		int customer = joinService.joinCustomer(paramCustomer);
		
		
		/*
		 * if(emp != null) {
		 * 
		 * session.setAttribute("loginEmp", emp);
		 * 
		 * targetUrl = "redirect:/emp/main"; // 로그인 성공시 페이지 }
		 */
		
		if(customer != 0) {
			targetUrl = "redirect:/login";
		}
		
		return targetUrl;
		
	}
		
		
		
		
		
		
		
		/*		
 		public HashMap<String, Object> joinSave(@RequestParam HashMap<String, String> params) {
			log.debug(TeamColor.GREEN + params);
			String joinId = params.get(joinId);
			String joinPw = params.get(joinPw);
			String joinName = params.get(joinName);
			String joinBirth = params.get(joinBirth);
			String joinPhone = params.get(joinPhone);
			String joinAddress = params.get(joinAddress);
			
			
			return "join";
		}
		*/
	
	
	
	
	
	
	
	
}
