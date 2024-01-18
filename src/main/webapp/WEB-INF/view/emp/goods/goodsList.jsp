<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		
		<!-- Bootstrap CDN -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
				integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
		
		<style>
			table, th, td {
			  border: 1px solid black;
			}
		</style>
		
	</head>
	
	<body>
		
		<h1>상품 관리</h1>
		
		<a href = "${pageContext.request.contextPath }/emp/goods/addGoods">상품 등록</a>
		
		<table border = "1">
			<tr>
				<td>상품 번호</td>
				<td>상품 이름</td>
				<td>상위 카테고리</td>
				<td>하위 카테고리</td>
				<td>상품 가격</td>
				<td>활성화</td>
				<td>생성일</td>
				<td>자세히</td>
			</tr>
			<c:forEach var = "goods" items = "${goodsList }">
				<tr>
					<td>${goods.goodsNo }</td>
					<td>${goods.goodsName }</td>
					<td>${goods.goodsTypeContent }</td>
					<td>${goods.goodsType2Content }</td>
					<td>${goods.goodsPrice }</td>
					<td>${goods.goodsActive }</td>
					<td>${goods.createdate }</td>
					<td>
						<button type = "button" onClick="location.href=''">자세히</button>
					</td>
				</tr>
			</c:forEach>
		</table>
		
		<form method = "get" action = "${pageContext.request.contextPath }/emp/goods/goodsList">
			<table>
				<tr>
					<td>
						<select name = "searchType">
							<c:choose>
								<c:when test="${searchType.equals('g.goods_no') }">
									<option value = "g.goods_no" selected>상품 번호</option>
									<option value = "g.goods_name">상품 이름</option>
									<option value = "gt.goods_type_content">상위 카테고리</option>
									<option value = "gt2.goods_type2_content">하위 카테고리</option>
								</c:when>
								<c:when test="${searchType.equals('gt.goods_type_content') }">
									<option value = "g.goods_no">상품 번호</option>
									<option value = "g.goods_name">상품 이름</option>
									<option value = "gt.goods_type_content" selected>상위 카테고리</option>
									<option value = "gt2.goods_type2_content">하위 카테고리</option>
								</c:when>
								<c:when test="${searchType.equals('gt2.goods_type2_content') }">
									<option value = "g.goods_no">상품 번호</option>
									<option value = "g.goods_name">상품 이름</option>
									<option value = "gt.goods_type_content">상위 카테고리</option>
									<option value = "gt2.goods_type2_content" selected>하위 카테고리</option>
								</c:when>
								<c:otherwise>
									<option value = "g.goods_no">상품 번호</option>
									<option value = "g.goods_name" selected>상품 이름</option>
									<option value = "gt.goods_type_content">상위 카테고리</option>
									<option value = "gt2.goods_type2_content">하위 카테고리</option>
								</c:otherwise>
							</c:choose>
						</select>
					</td>
					<td>
						<input type = "text" name = "searchWord">
					</td>
					<td>
						<button type = "submit">검색</button>
					</td>
					<td>
						<button type="button" class="navyBtn" onClick="location.href='${pageContext.request.contextPath}/emp/goods/goodsList'">초기화</button>
					</td>
				</tr>
						
			</table>
		
		</form>
		
		
		<!-- 페이지 처리 시작 -->
		<div>
			<ul class="pagination justify-content-center">
				
				<!-- 페이지 처음 -->
				<li class="page-item">
					<a class="page-link" href="${pageContext.request.contextPath }/emp/goods/goodsList?currentPage=1&searchType=${searchType }&searchWord=${searchWord}">
						<span>처음</span>
					</a>
				</li>
				
				<!-- 페이지 이전(-10의 1페이지) -->
				<c:if test="${previousPage > 0}">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath }/emp/goods/goodsList?currentPage=${previousPage}&searchType=${searchType }&searchWord=${searchWord}">
							<span>이전</span>
						</a>
					</li>
				</c:if>
		
				<!-- 페이지 1 ~ 10 -->
				<c:forEach var="i" items="${pageList }">
					<!-- 현재페이지 active 속성 부여 -->
					<c:choose>
						<c:when test="${currentPage == i}">
							<li class = "page-item active">
						</c:when >
						<c:otherwise>
							<li class = "page-item">
						</c:otherwise>
					</c:choose>
				
					<!-- 마지막 페이지 까지만 출력 -->
					<c:if test="${i <= lastPage }">
						<a class="page-link" href="${pageContext.request.contextPath }/emp/goods/goodsList?currentPage=${i}&searchType=${searchType }&searchWord=${searchWord}">
							<span>${i }</span>
						</a>
					</c:if>
					
							</li>
					
				</c:forEach>
		
				<!-- 페이지 다음(+10의 1페이지) -->
				<c:if test="${nextPage <= lastPage }">
					<li class="page-item">
						<a class="page-link" href="${pageContext.request.contextPath }/emp/goods/goodsList?currentPage=${nextPage}&searchType=${searchType }&searchWord=${searchWord}">
							<span>다음</span>
						</a>
					</li>
				</c:if>
		
				<!-- 페이지 마지막 -->
				<li class="page-item">
					<a class="page-link" href="${pageContext.request.contextPath }/emp/goods/goodsList?currentPage=${lastPage}&searchType=${searchType }&searchWord=${searchWord}">
						<span>마지막</span>
					</a>
				</li>
			</ul>
		</div>
		<!-- 페이지 처리 끝 -->
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	</body>
</html>