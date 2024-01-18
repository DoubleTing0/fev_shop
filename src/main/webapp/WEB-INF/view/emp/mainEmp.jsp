<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<h1>관리자 메인</h1>
		<h1>${loginEmp.empName }님 어서오세요!</h1>
		<div>
			<h1>
				<a href = "${pageContext.request.contextPath }/logout">로그아웃</a>
			</h1>
		</div>
		
		<div>
			<br>
			<a href = "${pageContext.request.contextPath }/emp/goods/goodsList">상품 관리</a>
		</div>
		
		<div>
			<br>
			<a href = "${pageContext.request.contextPath }/emp/goodsType/goodsTypeList">카테고리 관리</a>
		</div>
		
	</body>
</html>