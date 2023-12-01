package com.fev.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fev.shop.mapper.TestMapper;

@Service
@Transactional
public class TestService {

	@Autowired private TestMapper testMapper;
	
	public String testService(String empId) {
		
		return testMapper.testMapper(empId);
		
	}
	
}
