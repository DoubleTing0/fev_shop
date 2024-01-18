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

	@Autowired
	private JoinService joinService;

	// 회원가입
	@GetMapping("/joinCustomer")
	public String join() {
		return "join";
	}

	// 회원가입 등록
	@PostMapping("/joinForm")
	public String loginEmp(HttpSession session, Customer paramCustomer, @RequestParam(value = "joinId") String joinId,
			@RequestParam(value = "joinPw") String joinPw
//							,@RequestParam(value="joinPw2") String joinPw2
			, @RequestParam(value = "joinName") String joinName, @RequestParam(value = "joinPhone") String joinPhone) {

		log.debug(TeamColor.GREEN + "joinController /joinForm");

		String targetUrl = "redirect:/joinCustomer"; // 로그인 실패시 페이지

		paramCustomer.setCustomer_id(joinId);
		paramCustomer.setCustomer_pw(joinPw);
		paramCustomer.setCustomer_name(joinName);
		paramCustomer.setCustomer_phone(joinPhone);
		log.debug(TeamColor.GREEN + paramCustomer);
		int customer = joinService.joinCustomer(paramCustomer);

		if (customer != 0) {
			targetUrl = "redirect:/login";
		}

		return targetUrl;
	}

}
