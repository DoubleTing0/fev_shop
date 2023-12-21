package com.fev.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fev.shop.service.GoodsTypeService;
import com.fev.shop.vo.GoodsType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GoodsTypeController {
	
	@Autowired private GoodsTypeService goodsTypeService;
	
	// [관리자] 상품 상위 카테고리 List Get
	@GetMapping("/emp/goodsType/goodsTypeList")
	public String goodsTypeList(Model model) {
		
		List<GoodsType> goodsTypeList = goodsTypeService.selectGoodsTypeList();
		
		model.addAttribute("goodsTypeList", goodsTypeList);
		
		return "emp/goodsType/goodsTypeList";
		
	}
	
	
	
}
