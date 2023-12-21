package com.fev.shop.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fev.shop.vo.Goods;
import com.fev.shop.vo.GoodsOption;

@Mapper
public interface GoodsOptionMapper {

	// [관리자] 상품 옵션 추가
	int addGoodsOption(GoodsOption goodsOption);
	
}
