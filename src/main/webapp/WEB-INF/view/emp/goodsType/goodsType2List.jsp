<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		
		<c:forEach var = "goodsType2" items = "${goodsType2List }">
			<div>${goodsType2.goodsType2No }</div>	
			<div>${goodsType2.goodsTypeNo }</div>	
			<div>${goodsType2.goodsType2Content }</div>	
			<div>${goodsType2.createdate }</div>
		</c:forEach>
		
		<div>
			<select>
				<c:forEach var = "goodsType2" items = "${goodsType2List }">
					<option value = "${goodsType2.goodsType2No }">${goodsType2.goodsType2Content }</option>
				</c:forEach>
			</select>
		</div>
		
		<div>
			<select>
			</select>
		</div>
		
		
		
	</body>
</html>