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
			<h1>하위 카테고리 등록</h1>
		</div>
		
		<div>
			<h3>상위 카테고리 : ${goodsType.goodsTypeContent }</h3>
		</div>
		
		<div>
			<form method = "post" action = "${pageContext.request.contextPath }/emp/goodsType/addGoodsType2">
				<input type = "hidden" name = "goodsTypeNo" value = "${goodsType.goodsTypeNo }">
				
				<table border = "1">
					<tr>
						<td>하위 카테고리</td>
						<td>
							<input type = "text" name = "goodsType2Content">
						</td>
					</tr>
				</table>
				
				<br>
				<button type = "submit">등록</button>
			</form>
		</div>
		
		
		
	</body>
</html>