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
			<h1>하위 카테고리 관리</h1>
		</div>
		
		<div>
			<h3>상위 카테고리 : ${goodsType.goodsTypeContent}</h3>
		</div>
		
		<div>
			<table border = "1">
				<tr>
					<td>하위 카테고리</td>
					<td>수정</td>
					<td>삭제</td>
				</tr>
				
				<c:forEach var = "goodsType2" items = "${goodsType2List }">
					<c:if test="${goodsType2.goodsTypeNo == goodsType.goodsTypeNo }">
						<tr>
							<td>
								${goodsType2.goodsType2Content }
							</td>
							<td>
								<button type="button" onClick="location.href='${pageContext.request.contextPath }/emp/goodsType/modifyGoodsType2?goodsTypeNo=${goodsType.goodsTypeNo }&goodsType2No=${goodsType2.goodsType2No }'">수정</button>
							</td>
							<td>
								<form method = "post" action = "${pageContext.request.contextPath }/emp/goodsType/deleteGoodsType2">
									<input type = "hidden" name = "goodsTypeNo" value = "${goodsType.goodsTypeNo }">								
									<input type = "hidden" name = "goodsType2No" value = "${goodsType2.goodsType2No }">								
									<button type = "submit">삭제</button>
								</form>
							</td>
						</tr>						
					</c:if>
				</c:forEach>
			</table>		
		</div>
		
		<div>
			<br>
			<button type="button" onClick="location.href='${pageContext.request.contextPath }/emp/goodsType/addGoodsType2?goodsTypeNo=${goodsType.goodsTypeNo }'">등록</button>
		</div>		
		
		<div>
			<br>
			<button type="button" onClick="location.href='${pageContext.request.contextPath }/emp/goodsType/goodsTypeList'">이전</button>
		</div>
		
		
		
		
		
		
		
	</body>
</html>