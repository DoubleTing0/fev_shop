package com.fev.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fev.shop.service.GoodsType2Service;
import com.fev.shop.vo.GoodsType2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GoodsType2Controller {

	@Autowired private GoodsType2Service goodsType2Service;
	
	// [관리자] 상품 하위 카테고리 List Get
	@GetMapping("/emp/goodsType/goodsType2List")
	public String goodsType2List(Model model) {
		
		List<GoodsType2> goodsType2List = goodsType2Service.selectGoodsType2List();
		
		model.addAttribute("goodsType2List", goodsType2List);
		
		return "emp/goodsType/goodsType2List";
		
	}
	
}
