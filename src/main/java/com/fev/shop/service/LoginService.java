package com.fev.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fev.shop.mapper.LoginMapper;
import com.fev.shop.vo.Emp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class LoginService {

	@Autowired private LoginMapper loginMapper;
	
	// 관리자 로그인
	public Emp loginEmp(Emp emp) {
		
		return loginMapper.loginEmp(emp);
		
	}
	
}
