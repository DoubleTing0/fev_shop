package com.fev.shop.vo;

import lombok.Data;

@Data
public class GoodsType2 {

	private int goodsType2No;	// 하위 카테고리 키
	private int goodsTypeNo;	// 상위 카테고리 키
	private String goodsType2Content;	// 하위 카테고리 내용
	private String createdate;
	
}
