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
			<h1>상위 카테고리 관리</h1>
		</div>
		
		<div>
			<table border = "1">
				<tr>
					<td>상위 카테고리</td>
					<td>수정</td>
					<td>삭제</td>
				</tr>
				
				<c:forEach var = "goodsType" items = "${goodsTypeList }">
					<tr>
						<td>
							<a href = "${pageContext.request.contextPath }/emp/goodsType/goodsType2List?goodsTypeNo=${goodsType.goodsTypeNo }">
								${goodsType.goodsTypeContent }
							</a>
						</td>
						<td>
							<button type="button" onClick="location.href='${pageContext.request.contextPath }/emp/goodsType/modifyGoodsType?goodsTypeNo=${goodsType.goodsTypeNo }'">수정</button>
						</td>
						<td>
							<form method = "post" action = "${pageContext.request.contextPath }/emp/goodsType/deleteGoodsType">
								<input type = "hidden" name = "goodsTypeNo" value = "${goodsType.goodsTypeNo }">
								<button type = "submit">삭제</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</table>
			
			<div>
				<br>
				<button type="button" onClick="location.href='${pageContext.request.contextPath }/emp/goodsType/addGoodsType'">등록</button>
			</div>
			
			<div>
				<br>
				<button type="button" onClick="location.href='${pageContext.request.contextPath }/emp/main'">이전</button>
				
			</div>
			
			
		</div>
		
	</body>
</html>