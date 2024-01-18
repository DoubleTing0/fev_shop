<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		
		<!-- Bootstrap CDN -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
				integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">		
		
		<style>
			table, th, td {
			  border: 1px solid black;
			}
			
			img {
				width : 300px;
				height : 300px;
			}
		</style>
	</head>
	
	<body>
		<div>
			<h1>상품 One</h1>
			<br>
		</div>
		
		<div>
			<h3>상품 이미지</h3>	
			<img src="${pageContext.request.contextPath }/upload/goodsImg/5e7708f206bd45a8813fa7b386e26417.PNG" alt="상품 이미지" />
			<div>
				<button type = "buttn" onClick="location.href=''">이미지 변경</button>
			</div>
			<br>
		</div>
		
		<div>
			<h3>상품 정보</h3>
			<div>
				<table>
					<tr>
						<td>상품 번호</td>
						<td>상품 이름</td>
						<td>상위 카테고리</td>
						<td>하위 카테고리</td>
						<td>상품 가격</td>
						<td>활성화</td>
						<td>생성일</td>
						<td>수정</td>
						<td>삭제</td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>
							<button type = "buttn" onClick="location.href=''">수정</button>
						</td>
						<td>
							<button type = "buttn" onClick="location.href=''">삭제</button>
						</td>
					</tr>
				</table>
			</div>
			<br>
		</div>
		
		
		<div>
			<h3>상품 옵션 정보</h3>
		
		</div>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	</body>
</html>