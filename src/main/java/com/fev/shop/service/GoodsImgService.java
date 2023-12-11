package com.fev.shop.service;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fev.shop.mapper.GoodsImgMapper;
import com.fev.shop.util.TeamColor;
import com.fev.shop.vo.GoodsImg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GoodsImgService {

	@Autowired private GoodsImgMapper goodsImgMapper;
	
	// 상품 이미지 추가
	public int addGoodsImg(MultipartFile mfImg, String path) {
		
		int resultRow = 0;
		
		if(mfImg.isEmpty()) {
			
			// 파일 선택 안한 경우
			log.debug(TeamColor.BLUE + "파일 선택 안됨");

		} else {
			
			// 파일 선택 한 경우
			
			// 확장자 포함 원본 이름
			String originName = mfImg.getOriginalFilename();
			
			// 확장자
			String ext = originName.substring(originName.lastIndexOf(".") + 1);
			
			// 중복되지 않는 새로운 이름 생성 후 "-" 제거 
			String newName = UUID.randomUUID().toString().replace("-", "");
	
			// 업로드 폴더 경로 + 새로운 이름 + 확장자
			String newFullName = path + newName + "." + ext;
			
			log.debug(TeamColor.BLUE + newFullName + " <-- newFullName");
		
			// newFullName 으로 빈 파일 생성
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
			goodsImg.setGoodsNo(1);	// 상품 No
			goodsImg.setSaveName(newName);	// 업로드 폴더에 저장된 이름
			goodsImg.setOriginName(originName);	// 확장자 포함 원본 이름
			goodsImg.setType(mfImg.getContentType());	// 이미지 타입
			goodsImg.setSize(mfImg.getSize());	// 파일 용량
			
			resultRow = goodsImgMapper.addGoodsImg(goodsImg);
		
		}
		
		
		return resultRow;
		
	}
	
}
