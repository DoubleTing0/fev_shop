<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		
		<h1>addGoodsImg</h1>
		
		<form method = "post" enctype = "multipart/form-data" action = "${pageContext.request.contextPath }/goods/addGoodsImg">
		
			<div>
				사진1 : <input type = "file" name = "goodsImg">
			</div>
		
			<div>
				<button>등록</button>
			</div>
			
		
		</form>
		
		
		
	</body>
</html>