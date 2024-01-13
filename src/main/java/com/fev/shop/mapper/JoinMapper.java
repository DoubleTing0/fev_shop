package com.fev.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.Customer;

@Mapper
public interface JoinMapper {

	// 회원가입
	public int joinCustomer(Customer customer);
	
}
