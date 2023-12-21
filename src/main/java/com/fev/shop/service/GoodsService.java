package com.fev.shop.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fev.shop.mapper.GoodsImgMapper;
import com.fev.shop.mapper.GoodsMapper;
import com.fev.shop.mapper.GoodsOptionMapper;
import com.fev.shop.util.TeamColor;
import com.fev.shop.vo.Goods;
import com.fev.shop.vo.GoodsImg;
import com.fev.shop.vo.GoodsOption;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@Service
public class GoodsService {
	
	@Autowired private GoodsMapper goodsMapper;
	@Autowired private GoodsOptionMapper goodsOptionMapper;
	@Autowired private GoodsImgMapper goodsImgMapper;
	
	// [관리자] 상품 추가
	public int addGoods(Goods goods, GoodsOption goodsOption, MultipartFile mfImg, String path) {
		
		int resultRow = 0;	// 최종 성공 여부
		int resultRowG = 0;	// 상품 추가 성공 여부
		int resultRowGO = 0;	// 옵션 추가 성공 여부
		int resultRowGI = 0;	// 이미지 추가 성공 여부
		
		// [상품 추가 시작]
		
		log.debug(TeamColor.BLUE + goods.toString());
		
		// DB에 상품 추가 후 goodsNo 반환
		resultRowG = goodsMapper.addGoods(goods);
		
		// [상품 추가 끝]
		
		log.debug(TeamColor.BLUE + goods.getGoodsNo() + " <-- goodsNo");
		
		
		// [상품 옵션 추가 시작]
		
		// 옵션에 goodsNo 추가
		goodsOption.setGoodsNo(goods.getGoodsNo());
		
		log.debug(TeamColor.BLUE + goodsOption.toString());
		
		// 옵션 추가
		resultRowGO = goodsOptionMapper.addGoodsOption(goodsOption);
		
		// [상품 옵션 추가 끝] 

		
		
		// [상품 이미지 추가 시작]
		
		if(mfImg.isEmpty()) {
			
			// 파일 선택 안한 경우
			log.debug(TeamColor.BLUE + "파일 선택 안됨");

		} else {
			// 파일 선택 한 경우
			
			ArrayList<String> typeList = new ArrayList<>(Arrays.asList("image/png", "image/jpeg", "image/jpg", "image/gif", "image/webp", "image/tiff"));
			
			for (String type : typeList) {
				
				log.debug(TeamColor.BLUE + type + " <-- type");
				log.debug(TeamColor.BLUE + mfImg.getContentType() + " <-- mfImg.getContentType()");
				
				
				// contentType 유효성 검사
				// 위 항목들 중 같을 때 이미지 추가
				if(type.equals(mfImg.getContentType())) {
					
					// 확장자 포함 원본 이름
					String originName = mfImg.getOriginalFilename();
					
					// 확장자
					String ext = originName.substring(originName.lastIndexOf(".") + 1);
					
					// 중복되지 않는 새로운 이름 생성 후 "-" 제거 
					String newName = UUID.randomUUID().toString().replace("-", "");
					
					// 업로드 폴더 경로 + 새로운 이름 + 확장자
					String newFullName = path + newName + "." + ext;
					
					log.debug(TeamColor.BLUE + newFullName + " <-- newFullName");
					
					// newFullName 으로 경로에 빈 파일 생성
					File file = new File(newFullName);
					
					try {
						
						// 빈 파일에 mfImg 파일 복사
						mfImg.transferTo(file);
						
					} catch (Exception e) {
						
						/* 
						 * 파일 업로드에 실패하면
						 * try catch 절이 필요로 하지 않는 RuntimeException 을 일부러 발생시켜
						 * @Transactional 이 감지하여 롤백 할 수 있도록한다.
						 * 
						 */
						
						e.printStackTrace();
						
						throw new RuntimeException();
					}
					
					// 이미지 파일 정보 DB에 저장
					GoodsImg goodsImg = new GoodsImg();
					goodsImg.setGoodsNo(goods.getGoodsNo());	// 상품 No
					goodsImg.setSaveName(newName);	// 업로드 폴더에 저장된 이름
					goodsImg.setOriginName(originName);	// 확장자 포함 원본 이름
					goodsImg.setType(mfImg.getContentType());	// 이미지 타입
					goodsImg.setSize(mfImg.getSize());	// 파일 용량
					
					// DB에 상품 이미지 파일 정보 저장
					resultRowGI = goodsImgMapper.addGoodsImg(goodsImg);
					
				}
				
			}
				
		}		
		
		// [상품 이미지 추가 끝]
		
		
		// 옵션과 이미지 추가에 성공한다면
		if(resultRowGO == 1 && resultRowGI == 1) {
			
			resultRow = 1;
			
		}
		
		
		return resultRow;
		
	}

}
