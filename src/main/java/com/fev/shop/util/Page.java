package com.fev.shop.util;

import java.util.ArrayList;

public class Page {

	// beginRow	시작행
	// rowPerPage 한번에 보여줄 행의 수
	public static int getBeginRow(int currentPage, int rowPerPage) {
		
		int beginRow = (currentPage - 1) * rowPerPage;
				
		return beginRow;
	}
	
	// previousPage 이전 페이지
	// pageLegnth 한 번에 표시할 페이지 길이
	// ex) pageLength = 7 일 때
	//		처음 이전	1	2	3	4	5	6	7	다음	마지막
	
	// 11 ~ 20 페이지 일 때 이전 누르면 1 페이지로 이동
	// 21 ~ 30 페이지 일 때 이전 누르면 11 페이지로 이동
	public static int getPreviousPage(int currentPage, int pageLength) {
		
		int previousPage = (((currentPage - 1) / pageLength) * pageLength) - (pageLength - 1);
		
		return previousPage;
		
	}
	
	// nextPage	다음 페이지
	// ex) pageLength = 7 일 때
	//		처음 이전	1	2	3	4	5	6	7	다음	마지막
	
	// 1 ~ 10 페이지 일 때 다음 누르면 11 페이지로 이동
	// 11 ~ 20 페이지 일 떄 다음 누르면 21 페이지로 이동
	public static int getNextPage(int currentPage, int pageLength) {
		
		int nextPage = (((currentPage - 1) / pageLength) * pageLength) + (pageLength + 1);
		
		return nextPage;
		
	}
	
	// lastpage 마지막 페이지
	public static int getLastPage(int count, int rowPerPage) {
		
		int lastPage = count /rowPerPage;
		if((count % rowPerPage) != 0) {
			lastPage += 1;
		}
		
		return lastPage;
	}
	
	// pageList
	// pageLength에 따른 표시할 페이지 리스트
	public static ArrayList<Integer> getPageList(int currentPage, int pageLength) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int x=1; x<=pageLength; x+=1) {
			int page = (((currentPage - 1) / pageLength) * pageLength) + x;
			list.add(page);
		}
		
		return list;
	}	
	
}
