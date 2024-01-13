package com.fev.shop.vo;

import lombok.Data;

@Data
public class Customer {

	private String customer_id;	// 고객 ID
	private String customer_pw;	// 고객 PW
	private String customer_name;	// 고객 이름
	private String customer_phone;	// 고객 전화번호
	private int point;	// 고객 보유 포인트
	private String createdate;	// 생성일
}
