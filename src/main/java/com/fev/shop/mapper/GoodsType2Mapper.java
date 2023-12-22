package com.fev.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.GoodsType2;

@Mapper
public interface GoodsType2Mapper {

	// [관리자] 상품 하위 카테고리 삭제
	int deleteGoodsType2(GoodsType2 goodsType2);
	
	// [관리자] 상품 하위 카테고리 수정
	int modifyGoodsType2(GoodsType2 goodsType2);
	
	// [관리자] 상품 하위 카테고리 추가
	int addGoodsType2(GoodsType2 goodsType2);
	
	// [관리자] 상품 하위 카테고리 One
	GoodsType2 getGoodsType2One(GoodsType2 goodsType2);
	
	// [관리자] 상품 하위 카테고리 List
	List<GoodsType2> getGoodsType2List();
	
}
