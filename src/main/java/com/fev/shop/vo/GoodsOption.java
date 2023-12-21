package com.fev.shop.vo;

import lombok.Data;

@Data
public class GoodsOption {

	private int goodsOptionNo;	// 상품 옵션 키
	private int goodsNo;	// 상품 키
	private String goodsOptionContent;	// 옵션 내용
	private int goodsOptionQuantity;	// 옵션 수량
	private String createdate;
	
}
