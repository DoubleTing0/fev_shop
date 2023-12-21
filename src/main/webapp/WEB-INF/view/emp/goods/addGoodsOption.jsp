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
			<h1>상품 옵션 추가</h1>
		</div>
		
		<div>
			<form method = "post" action = "${pageContext.request.contextPath }/emp/goods/addGoodsOption">
				<table>
					<tr>
						<td>상품 옵션 내용</td>
						<td>
							<input type = "text" name = "goodsOptionContent">
						</td>
					</tr>
					<tr>
						<td>상품 옵션 수량</td>
						<td>
							<input type = "number" name = "goodsOptionQuantity" value = 0>
						</td>
					</tr>
					<tr>
						<td colspan = "2">
							<button type = "submit">추가</button>
						</td>
					</tr>
						
				</table>
			</form>
		</div>
		
	</body>
</html>