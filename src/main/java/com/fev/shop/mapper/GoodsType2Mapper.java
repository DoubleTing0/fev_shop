package com.fev.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.GoodsType2;

@Mapper
public interface GoodsType2Mapper {

	// [관리자] 상품 하위 카테고리 List
	List<GoodsType2> selectGoodsType2List();
	
}
