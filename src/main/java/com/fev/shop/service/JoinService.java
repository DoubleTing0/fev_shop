package com.fev.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fev.shop.mapper.JoinMapper;
import com.fev.shop.vo.Customer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class JoinService {

	@Autowired private JoinMapper joinMapper;

	// 고객 회원가입 서비스
	public int joinCustomer(Customer customer) {
		return joinMapper.joinCustomer(customer);
	}
	
}
