package com.fev.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.Goods;

@Mapper
public interface GoodsMapper {

	// [관리자] 상품 추가
	int addGoods(Goods goods);
	
	// [관리자] 상품 관리 List (검색, 페이징)
	List<Map<String, Object>> getGoodsList(Map<String, Object> paramMap);
	
	// [관리자] 상품 count (검색, 페이징)
	int countGoods(Map<String, Object> paramMap);
	
	// [관리자] 상품 One
	Map<String, Object> getGoodsOne(int goodsNo);
	
	
}
