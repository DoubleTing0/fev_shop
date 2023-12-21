package com.fev.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fev.shop.mapper.GoodsOptionMapper;
import com.fev.shop.vo.GoodsOption;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@Service
public class GoodsOptionService {
	
	@Autowired private GoodsOptionMapper goodsOptionMapper;
	
	// [관리자] 상품 옵션 추가
	public int addGoodsOption(GoodsOption goodsOption) {
		
		return goodsOptionMapper.addGoodsOption(goodsOption);
		
	}

}
