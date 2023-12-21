<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		
		<!-- jQuery -->
		<!-- CDN 주소 추가 방식 -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>		
		
		<script>
		
			$(document).ready(function() {
			
				let type = $('#typeSelect')
				let type2 = $('#type2Select')
				let type2Option = $('#type2Select option')
				
				for(let i=0; i<type2Option.length; i++) {
					
					if(type.val() != type2Option[i].id) {
						
						type2Option.eq(i).hide();
						
					}
					
				}
				
				// 상위 카테고리를 변경할 때
				type.change(function() {
					
					type2Option.show();
					
					let count = 0;
					let check = 0;
					
					for(let i=0; i<type2Option.length; i++) {
						
						if($(this).val() != type2Option[i].id) {
							
							type2Option.eq(i).hide();
							
							count++;
							
						} else {
							
							if(check == 0) {
								
								type2Option.eq(count).prop("selected", true);
								check++;
								
							}
							
						}
						
					}
					
					
				});
				
				//$('#type2Select option').hide();
				console.log($('#type2Select option:eq(2)'));
				console.log($('#type2Select option').eq(2));
				//$('#type2Select option:eq(2)').hide();
				console.log($('#typeSelect option').length)
				console.log($('#type2Select option')[2].id)
				//console.log($('#type2Select option').index($('#type2Select option:selected')))
				
			});
			
			
		
		
		</script>
		
	</head>
	
	<body>
		
		<div>
			<h1>상품 등록</h1>
		</div>
		
		<div>
			<form method = "post" enctype = "multipart/form-data" action = "${pageContext.request.contextPath }/emp/goods/addGoods">
			
				<table>
					<tr>
						<td>상품 상위 카테고리</td>
						<td>
							<select id = "typeSelect" name = "goodsTypeNo">
								<c:forEach var = "type" items = "${goodsTypeList }">
									<option value = "${type.goodsTypeNo }">${type.goodsTypeContent }</option>
								</c:forEach>
							</select>
						</td>
					</tr>
						
					<tr>
						<td>상품 하위 카테고리</td>
						<td>
							<select id = "type2Select" name = "goodsType2No">
								<c:forEach var = "type2" items = "${goodsType2List }">
									<option value = "${type2.goodsType2No }" id = "${type2.goodsTypeNo }">${type2.goodsType2Content }</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					
					<tr>
						<td>상품 이름</td>
						<td>
							<input type = "text" name = "goodsName">
						</td>
					</tr>
					
					<tr>
						<td>상품 가격</td>
						<td>
							<input type = "number" name = "goodsPrice">
						</td>
					</tr>

					<tr>
						<td>상품 활성화</td>
						<td>
							<input type = "radio" name = "goodsActive" value = "Y" checked>Yes
							<input type = "radio" name = "goodsActive" value = "No">No
						</td>
					</tr>

					<tr>
						<td colspan = "2"><br></td>
					</tr>

					<tr>
						<td>상품 옵션 내용</td>
						<td>
							<input type = "text" name = "goodsOptionContent">
						</td>
					</tr>
					
					<tr>
						<td>상품 옵션 수량</td>
						<td>
							<input type = "number" name = "goodsOptionQuantity">
						</td>
					</tr>
					
					<tr>
						<td colspan = "2"><br></td>
					</tr>
					
					<tr>
						<td>상품 이미지</td>
						<td>
							<input type = "file" name = "goodsImg">
						</td>
					</tr>

					<tr>
						<td colspan = "2"><br></td>
					</tr>

					<tr>
						<td colspan = "2">
							<button type = "submit">상품 등록</button>
						</td>
					</tr>
				
				</table>
			
			
			
			</form>
		</div>
		
		
	</body>
</html>