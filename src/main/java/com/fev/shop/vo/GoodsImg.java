package com.fev.shop.vo;

import lombok.Data;

@Data
public class GoodsImg {

	private int goodsImgNo;
	private int goodsNo;
	private String saveName;	// 저장된 파일 이름
	private String originName;	// 원본 파일 이름
	private String type;	// 이미지 타입
	private Long size;	// 파일 용량
	private String createdate;
	
}
