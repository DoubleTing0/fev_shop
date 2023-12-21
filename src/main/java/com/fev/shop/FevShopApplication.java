package com.fev.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan	// Filter 사용 설정
public class FevShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FevShopApplication.class, args);
	}

}
