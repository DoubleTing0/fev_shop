package com.fev.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fev.shop.mapper.GoodsType2Mapper;
import com.fev.shop.vo.GoodsType2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class GoodsType2Service {

	@Autowired private GoodsType2Mapper goodsType2Mapper;
	
	
	
	// [관리자] 상품 하위 카테고리 삭제
	public int deleteGoodsType2(GoodsType2 goodsType2) {
		
		return goodsType2Mapper.deleteGoodsType2(goodsType2);
		
	}
	
	// [관리자] 상품 하위 카테고리 수정
	public int modifyGoodsType2(GoodsType2 goodsType2) {
		
		return goodsType2Mapper.modifyGoodsType2(goodsType2);
		
	}
	
	
	// [관리자] 상품 하위 카테고리 추가
	public int addGoodsType2(GoodsType2 goodsType2) {
		
		return goodsType2Mapper.addGoodsType2(goodsType2);
		
	}
	
	// [관리자] 상품 하위 카테고리 One
	public GoodsType2 getGoodsType2One(GoodsType2 goodsType2) {
		
		return goodsType2Mapper.getGoodsType2One(goodsType2);
		
	}
	
	// [관리자] 상품 하위 카테고리 List
	public List<GoodsType2> getGoodsType2List() {
		
		return goodsType2Mapper.getGoodsType2List();
		
	}
	
}
