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
		
	</head>
	
	<body>
		<c:if test="${loginEmp == null && loginCustomer == null }">
		
			<div>
				<h1>로그인</h1>
			</div>	
	
			<div>
				<form id = "radioForm" action = "${pageContext.request.contextPath }/login" method = "post">
					<c:if test="${user == 'emp' || user == null }">
						<input type = "radio" name = "user" id = "rEmp" value = "emp" checked>관리자
						<input type = "radio" name = "user" id = "rCustomer" value = "customer">고객
					</c:if>
					 
					<c:if test="${user == 'customer' }">
						<input type = "radio" name = "user" id = "rEmp" value = "emp">관리자
						<input type = "radio" name = "user" id = "rCustomer" value = "customer" checked>고객
					</c:if> 
				</form>
			</div>
		
			<!-- emp -->
			<div>
				<form id = "empForm" action = "${pageContext.request.contextPath }/loginEmp" method = "post">
					<table border = "1">
						<tr>
							<td>ID</td>
							<td>
								<input type = "text" name = "empId" value = "emp">
							</td>
						</tr>
						
						<tr>
							<td>PASSWORD</td>
							<td>
								<input type = "password" name = "empPw">
							</td>
						</tr>
					</table>

					<div>
						<button type = "submit">로그인</button>
					</div>				
				</form>
			</div>
			
			<!-- customer -->
			<div>
				<form id = "customerForm" action = "${pageContext.request.contextPath }/loginCustomer" method = "post">
					<table border = "1">
						<tr>
							<td>ID</td>
							<td>
								<input type = "text" name = "customerId" value = "customer">
							</td>
						</tr>
						
						<tr>
							<td>PASSWORD</td>
							<td>
								<input type = "password" name = "customerPw">
							</td>
						</tr>
					</table>

					<div>
						<button type = "submit">로그인</button>
					</div>				
				</form>
			</div>
		</c:if>
		
		
		
		
		
		
		<h1>user : ${user }</h1>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	</body>
</html>