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
			<h1>상위 카테고리 수정</h1>
		</div>
		
		<div>
			<form method = "post" action = "${pageContext.request.contextPath }/emp/goodsType/modifyGoodsType?goodsTypeNo=${goodsType.goodsTypeNo}">
				<div>
					<table border = "1">
						<tr>
							<td>선택한 상위 카테고리</td>
							<td>${goodsType.goodsTypeContent }</td>
						</tr>
						<tr>
							<td>수정 내용</td>
							<td>
								<input type = "text" name = "goodsTypeContent">
							</td>
						</tr>
					</table>
				</div>
				
				<div>
					<br>
					<button type = "submit">수정</button>
				</div>
				
			</form>
		</div>
		
		
	</body>
</html>