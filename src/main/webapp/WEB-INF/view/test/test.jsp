<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		
	</head>
	
	<body>
		
		<div>DB확인 / 이름 : ${empName}</div>
		
		<div>
			JSTL 확인 : 
			<c:if test="${1<2 }">
				<a href="${pageContext.request.contextPath}/test2">test2로 이동</a>
			</c:if>					
		</div>
		
	</body>
</html>