package com.fev.shop.vo;

import lombok.Data;

@Data
public class Goods {

	private int goodsNo;	// 상품 키
	private int goodsTypeNo;	// 상품 상위 카테고리
	private int goodsType2No;	// 상품 하위 카테고리
	private String goodsName;	// 상품 이름
	private int goodsPrice;		// 상품 가격
	private String goodsActive;	// 상품 활성화 여부
	private String createdate;
	
}
