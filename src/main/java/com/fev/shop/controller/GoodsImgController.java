package com.fev.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fev.shop.service.GoodsImgService;
import com.fev.shop.util.TeamColor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GoodsImgController {
	
	@Autowired private GoodsImgService goodsImgService;
	
	// [관리자] 상품 이미지 추가 Get
	@GetMapping("/emp/goods/addGoodsImg")
	public String addGoodsImg() {
	
		return "emp/goods/addGoodsImg";
		
	}
	
	// [관리자] 상품 이미지 추가 Post
	@PostMapping("/emp/goods/addGoodsImg") 
	public String addGoodsImg(HttpSession session, HttpServletRequest request
								, @RequestParam(value="goodsImg") MultipartFile mfImg) {
		
		if(mfImg.isEmpty()) {
			log.debug(TeamColor.BLUE + "mfImg is empty");
		} else {
			log.debug(TeamColor.BLUE + "mfImg is not empty");
		}
		
		String path = request.getServletContext().getRealPath("/upload/goodsImg/");
		log.debug(TeamColor.BLUE + path + " <-- 이미지 경로");
		
		int resultRow = goodsImgService.addGoodsImg(mfImg, path);
		
		if(resultRow == 1) {
			log.debug(TeamColor.BLUE + "상품 이미지 등록 성공");
		} else {
			log.debug(TeamColor.BLUE + "상품 이미지 등록 실패");
		}
		
		return "redirect:/emp/goods/addGoodsImg";
		
	}

}
