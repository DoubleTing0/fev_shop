<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<h1>상위 카테고리 등록</h1>
		
		<div>
			<form method = "post" action = "${pageContext.request.contextPath }/emp/goodsType/addGoodsType">
				<div>
					<table border = "1">
						<tr>
							<td>상위 카테고리</td>
							<td>
								<input type = "text" name = "goodsTypeContent">
							</td>
						</tr>
					</table>
				</div>
				
				<div>
					<br>
					<button type = "submit">등록</button>
				</div>
			</form>
		</div>
		
		
	</body>
</html>