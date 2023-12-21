package com.fev.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.Emp;

@Mapper
public interface LoginMapper {

	// 관리자 로그인
	Emp loginEmp(Emp emp);
	
}
