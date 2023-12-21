package com.fev.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fev.shop.mapper.GoodsTypeMapper;
import com.fev.shop.vo.GoodsType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class GoodsTypeService {

	@Autowired private GoodsTypeMapper goodsTypeMapper;
	
	// [관리자] 상품 상위 카테고리 List
	public List<GoodsType> selectGoodsTypeList() {
		
		return goodsTypeMapper.selectGoodsTypeList();
		
	}
	
}
