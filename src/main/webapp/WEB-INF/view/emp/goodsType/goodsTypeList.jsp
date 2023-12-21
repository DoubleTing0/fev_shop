<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		
		<c:forEach var = "goodsType" items = "${goodsTypeList }">
			<div>${goodsType.goodsTypeNo }</div>	
			<div>${goodsType.goodsTypeContent }</div>	
			<div>${goodsType.createdate }</div>
		</c:forEach>
		
		<div>
			<select>
				<c:forEach var = "goodsType" items = "${goodsTypeList }">
					<option value = "${goodsType.goodsTypeNo }">${goodsType.goodsTypeContent }</option>
				</c:forEach>
			</select>
		</div>
		
	</body>
</html>