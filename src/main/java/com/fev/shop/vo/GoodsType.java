package com.fev.shop.vo;

import lombok.Data;

@Data
public class GoodsType {

	private int goodsTypeNo;	// 상위 카테고리 키
	private String goodsTypeContent;	// 카테고리 내용
	private String createdate;
	
}
