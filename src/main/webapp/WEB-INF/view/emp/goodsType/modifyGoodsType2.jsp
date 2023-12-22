<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		
		<div>
			<h1>하위 카테고리 수정</h1>
		</div>
		
		<div>
			<h3>상위 카테고리 : ${goodsType.goodsTypeContent }</h3>
		</div>
		
		<div>
			<form method = "post" action = "${pageContext.request.contextPath }/emp/goodsType/modifyGoodsType2">
				<table border = "1">
					<tr>
						<td>선택한 하위 카테고리</td>
						<td>${goodsType2.goodsType2Content }</td>
					</tr>
					
					<tr>
						<td>수정 내용</td>
						<td>
							<input type = "hidden" name = "goodsTypeNo" value = "${goodsType.goodsTypeNo }">
							<input type = "hidden" name = "goodsType2No" value = "${goodsType2.goodsType2No }">
							<input type = "text" name = "goodsType2Content">
						</td>
					</tr>
				</table>

				<br>
				<button type = "submit">수정</button>
			
			</form>
		</div>
		
		
		
	</body>
</html>