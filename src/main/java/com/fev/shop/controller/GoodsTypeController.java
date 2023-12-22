package com.fev.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fev.shop.service.GoodsTypeService;
import com.fev.shop.vo.GoodsType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GoodsTypeController {
	
	@Autowired private GoodsTypeService goodsTypeService;
	
	// [관리자] 상품 상위 카테고리 삭제 Post
	@PostMapping("emp/goodsType/deleteGoodsType")
	public String deleteGoodsType(GoodsType goodsType) {
		
		goodsTypeService.deleteGoodsType(goodsType);
		
		return "redirect:/emp/goodsType/goodsTypeList";
		
	}
	
	// [관리자] 상품 상위 카테고리 수정 Get
	@GetMapping("emp/goodsType/modifyGoodsType")
	public String modifyGoodsType(Model model, GoodsType paramGoodsType) {
		
		GoodsType goodsType = goodsTypeService.getGoodsTypeOne(paramGoodsType);
		
		model.addAttribute("goodsType", goodsType);
		
		return "emp/goodsType/modifyGoodsType";
		
	}
	
	
	
	// [관리자] 상품 상위 카테고리 수정 Post
	@PostMapping("emp/goodsType/modifyGoodsType")
	public String modifyGoodsType(GoodsType goodsType) {
		
		goodsTypeService.modifyGoodsType(goodsType);
		
		return "redirect:/emp/goodsType/goodsTypeList";
		
	}
	
	
	
	
	// [관리자] 상품 상위 카테고리 등록 Get
	@GetMapping("/emp/goodsType/addGoodsType")
	public String addGoodsType() {
		
		return "emp/goodsType/addGoodsType";
		
	}
	
	// [관리자] 상품 상위 카테고리 등록 Post
	@PostMapping("/emp/goodsType/addGoodsType")
	public String addGoodsType(GoodsType goodsType) {
		
		goodsTypeService.addGoodsType(goodsType);
		
		return "redirect:/emp/goodsType/goodsTypeList";
		
	}
	
	
	
	// [관리자] 상품 상위 카테고리 List Get
	@GetMapping("/emp/goodsType/goodsTypeList")
	public String goodsTypeList(Model model) {
		
		List<GoodsType> goodsTypeList = goodsTypeService.getGoodsTypeList();
		
		model.addAttribute("goodsTypeList", goodsTypeList);
		
		return "emp/goodsType/goodsTypeList";
		
	}
	
	
	
}
