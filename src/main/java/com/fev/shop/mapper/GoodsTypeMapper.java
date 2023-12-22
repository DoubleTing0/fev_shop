package com.fev.shop.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.GoodsType;

@Mapper
public interface GoodsTypeMapper {

	// [관리자] 상품 상위 카테고리 삭제
	int deleteGoodsType(GoodsType goodsType);
	
	// [관리자] 상품 상위 카테고리 One
	GoodsType getGoodsTypeOne(GoodsType goodsType);
	
	// [관리자] 상품 상위 카테고리 수정
	int modifyGoodsType(GoodsType goodsType);
	
	// [관리자] 상품 상위 카테고리 등록
	int addGoodsType(GoodsType goodsType);
	
	// [관리자] 상품 상위 카테고리 List
	List<GoodsType> getGoodsTypeList();
	
}
