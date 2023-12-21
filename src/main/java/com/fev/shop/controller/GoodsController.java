package com.fev.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fev.shop.service.GoodsService;
import com.fev.shop.service.GoodsType2Service;
import com.fev.shop.service.GoodsTypeService;
import com.fev.shop.util.TeamColor;
import com.fev.shop.vo.Goods;
import com.fev.shop.vo.GoodsOption;
import com.fev.shop.vo.GoodsType;
import com.fev.shop.vo.GoodsType2;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GoodsController {

	@Autowired private GoodsService goodsService;
	@Autowired private GoodsTypeService goodsTypeService;
	@Autowired private GoodsType2Service goodsType2Service;

	// [관리자] 상품 추가
	@GetMapping("emp/goods/addGoods")
	public String addGoods(Model model) {
		
		List<GoodsType> goodsTypeList = goodsTypeService.selectGoodsTypeList();
		List<GoodsType2> goodsType2List = goodsType2Service.selectGoodsType2List();
		
		model.addAttribute("goodsTypeList", goodsTypeList);
		model.addAttribute("goodsType2List", goodsType2List);
		
		return "emp/goods/addGoods";
		
	}
	
	// [관리자] 상품 추가
	@PostMapping("emp/goods/addGoods")
	public String addGoods(HttpServletRequest request
							, Goods goods
							, GoodsOption goodsOption
							, @RequestParam(value = "goodsImg") MultipartFile mfImg) {
		
		// 상품 이미지 경로
		String path = request.getServletContext().getRealPath("/upload/goodsImg/");
		log.debug(TeamColor.BLUE + path + " <-- 이미지 경로");
		
		int resultRow = goodsService.addGoods(goods, goodsOption, mfImg, path);
		
		if(resultRow == 1) {
			log.debug(TeamColor.BLUE + "상품 이미지 등록 성공");
		} else {
			log.debug(TeamColor.BLUE + "상품 이미지 등록 실패");
		}		
		
		
		return "redirect:/emp/main";
		
	}
	
	
}
