package com.fev.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.Goods;

@Mapper
public interface GoodsMapper {

	// [관리자] 상품 추가
	int addGoods(Goods goods);
	
}
