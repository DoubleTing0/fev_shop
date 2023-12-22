package com.fev.shop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fev.shop.mapper.GoodsTypeMapper;
import com.fev.shop.util.Page;
import com.fev.shop.vo.GoodsType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class GoodsTypeService {

	@Autowired private GoodsTypeMapper goodsTypeMapper;
	
	// [관리자] 상품 상위 카테고리 삭제
	public int deleteGoodsType(GoodsType goodsType) {
		
		return goodsTypeMapper.deleteGoodsType(goodsType);
		
	}
	
	// [관리자] 상품 상위 카테고리 One
	public GoodsType getGoodsTypeOne(GoodsType goodsType) {
		
		return goodsTypeMapper.getGoodsTypeOne(goodsType);
		
	}
	
	// [관리자] 상품 상위 카테고리 수정
	public int modifyGoodsType(GoodsType goodsType) {
		
		return goodsTypeMapper.modifyGoodsType(goodsType);
		
	}
	
	// [관리자] 상품 상위 카테고리 등록
	public int addGoodsType(GoodsType goodsType) {
		
		return goodsTypeMapper.addGoodsType(goodsType);
		
	}
	
	// [관리자] 상품 상위 카테고리 List
	public List<GoodsType> getGoodsTypeList() {
		
		return goodsTypeMapper.getGoodsTypeList();
		
	}
	
}
