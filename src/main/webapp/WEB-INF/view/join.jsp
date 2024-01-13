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
		<!-- 
		<script>
		
			$(document).ready(function() {
				
				$('#rEmp').change(function() {
					$('#radioForm').submit();
				});
				
				$('#rCustomer').change(function() {
					$('#radioForm').submit();
				});
				
				console.log($('#rEmp').is(':checked'))
				
				if($('#rEmp').is(':checked')) {
					$('#empForm').show();
					$('#customerForm').hide();
				}
				
				if ($('#rCustomer').is(':checked')){
					$('#empForm').hide();
					$('#customerForm').show();
				}
				
			});
		
		</script>
		 -->
	</head>
	
	<body>

			<div>
				<h1>회원가입</h1>
			</div>	
	
			<div>
				<form id = "joinForm" action = "${pageContext.request.contextPath }/joinForm" method = "post">
					<table border = "1">
						<tr>
							<td>ID</td>
							<td>
								<input type = "text" name = "joinId">
							</td>
						</tr>						
						<tr>
							<td>PASSWORD</td>
							<td>
								<input type = "password" name = "joinPw">
							</td>
						</tr>						
						<tr>
							<td>이름</td>
							<td>
								<input type = "text" name = "joinName">
							</td>
						</tr>										
						<tr>
							<td>핸드폰번호</td>
							<td>
								<input type = "text" name = "joinPhone">
							</td>
						</tr>
						<!-- 						
						<tr>
							<td>주소</td>
							<td>
								<input type = "text" name = "joinAddress">
							</td>
						</tr> -->
					</table>

					<div>
						<button type = "submit">회원가입</button>
					</div>				
				</form>
			</div>
		
			
	</body>
</html>