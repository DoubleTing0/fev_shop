package com.fev.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fev.shop.service.GoodsOptionService;
import com.fev.shop.util.TeamColor;
import com.fev.shop.vo.GoodsOption;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GoodsOptionController {
	
	@Autowired private GoodsOptionService goodsOptionService;
	
	// [관리자] 상품 옵션 추가 Get
	@GetMapping("emp/goods/addGoodsOption")
	public String addGoodsOption() {
		
		return "emp/goods/addGoodsOption";
		
	}

	
	// [관리자] 상품 옵션 추가 Post
	@PostMapping("emp/goods/addGoodsOption")
	public String addGoodsOption(@RequestParam(value = "goodsOptionContent") String goodsOptionContent
								, @RequestParam(value = "goodsOptionQuantity") int goodsOptionQuantity) {
		
		// 임시 goodsNo
		
		GoodsOption goodsOption = new GoodsOption();
		goodsOption.setGoodsNo(77);
		goodsOption.setGoodsOptionContent(goodsOptionContent);
		goodsOption.setGoodsOptionQuantity(goodsOptionQuantity);
		
		int resultRow = goodsOptionService.addGoodsOption(goodsOption);
		
		if(resultRow == 1) {
			log.debug(TeamColor.BLUE + "상품 옵션 등록 성공");
		} else {
			log.debug(TeamColor.BLUE + "상품 옵션 등록 실패");
		}
		
		return "redirect:/emp/goods/addGoodsOption";
		
	}
}
