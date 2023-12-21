package com.fev.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.GoodsImg;

import lombok.extern.slf4j.Slf4j;

@Mapper
public interface GoodsImgMapper {

	// [관리자] 상품 이미지 추가
	int addGoodsImg(GoodsImg goodsImg);
	
}
