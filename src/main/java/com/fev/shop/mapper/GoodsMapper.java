package com.fev.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.Goods;

@Mapper
public interface GoodsMapper {

	// [관리자] 상품 추가
	int addGoods(Goods goods);
	
	// [관리자] 상품 List (검색, 페이징 가능)
	List<Goods> selectGoodsList(Map<String, Object> paramMap);
	
	
}
