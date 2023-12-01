package com.fev.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

	String testMapper(String empId);
	
}
