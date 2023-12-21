package com.fev.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.GoodsType;

@Mapper
public interface GoodsTypeMapper {

	// [관리자] 상품 상위 카테고리 List
	List<GoodsType> selectGoodsTypeList();
	
}
