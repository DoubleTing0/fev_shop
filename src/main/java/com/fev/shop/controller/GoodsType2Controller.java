package com.fev.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fev.shop.service.GoodsType2Service;
import com.fev.shop.service.GoodsTypeService;
import com.fev.shop.util.TeamColor;
import com.fev.shop.vo.GoodsType;
import com.fev.shop.vo.GoodsType2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GoodsType2Controller {

	@Autowired private GoodsType2Service goodsType2Service;
	@Autowired private GoodsTypeService goodsTypeService;
	
	// [관리자] 상품 하위 카테고리 삭제 Post
	@PostMapping("emp/goodsType/deleteGoodsType2")
	public String deleteGoodsType2(GoodsType2 goodsType2) {
		
		goodsType2Service.deleteGoodsType2(goodsType2);
		
		return "redirect:/emp/goodsType/goodsType2List?goodsTypeNo=" + goodsType2.getGoodsTypeNo();
		
	}
	
	// [관리자] 상품 하위 카테고리 수정 Get
	@GetMapping("emp/goodsType/modifyGoodsType2")
	public String modifyGoodsType2(Model model, GoodsType2 paramGoodsType2) {
		
		GoodsType goodsType = new GoodsType();
		goodsType.setGoodsTypeNo(paramGoodsType2.getGoodsTypeNo());
		
		log.debug(TeamColor.BLUE + goodsType.getGoodsTypeNo() + " <-- goodsTypeNo");
		
		goodsType = goodsTypeService.getGoodsTypeOne(goodsType);
		GoodsType2 goodsType2 = goodsType2Service.getGoodsType2One(paramGoodsType2);
		
		model.addAttribute("goodsType", goodsType);
		model.addAttribute("goodsType2", goodsType2);
		
		return "emp/goodsType/modifyGoodsType2";
		
	}
	
	// [관리자] 상품 하위 카테고리 수정 Post
	@PostMapping("emp/goodsType/modifyGoodsType2")
	public String modifyGoodsType2(GoodsType2 goodsType2) {
		
		log.debug(TeamColor.BLUE + goodsType2.toString());
		
		
		goodsType2Service.modifyGoodsType2(goodsType2);
		
		
		return "redirect:/emp/goodsType/goodsType2List?goodsTypeNo=" + goodsType2.getGoodsTypeNo();
		
	}
	
	
	
	
	// [관리자] 상품 하위 카테고리 추가 Get
	@GetMapping("emp/goodsType/addGoodsType2")
	public String addGoodsType2(Model model, GoodsType paramGoodsType) {
		
		GoodsType goodsType = goodsTypeService.getGoodsTypeOne(paramGoodsType);
		
		model.addAttribute("goodsType", goodsType);
		
		return "emp/goodsType/addGoodsType2";
		
	}
	
	// [관리자] 상품 하위 카테고리 추가 Post
	@PostMapping("emp/goodsType/addGoodsType2")
	public String addGoodsType2(GoodsType2 goodsType2) {
		
		goodsType2Service.addGoodsType2(goodsType2);
		
		return "redirect:/emp/goodsType/goodsType2List?goodsTypeNo=" + goodsType2.getGoodsTypeNo();
		
	}
	
	
	
	
	// [관리자] 상품 하위 카테고리 List Get
	@GetMapping("/emp/goodsType/goodsType2List")
	public String goodsType2List(Model model
									, GoodsType paramGoodsType) {
		
		List<GoodsType2> goodsType2List = goodsType2Service.getGoodsType2List();
		
		GoodsType goodsType = goodsTypeService.getGoodsTypeOne(paramGoodsType);
		
		model.addAttribute("goodsType", goodsType);
		model.addAttribute("goodsType2List", goodsType2List);
		
		return "emp/goodsType/goodsType2List";
		
	}
	
}
