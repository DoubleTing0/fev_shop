<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

<!-- jQuery -->
<!-- CDN 주소 추가 방식 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>



<script>
	function sendIt() {
		var form = document.joinForm;
		var regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		var regExpName = /^[가-힣]*$/;
		var regExpPasswd = /^[0-9]*$/;
		var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;

		if (form.joinId.value == "") {
			alert("아이디를 입력해주세요");
			form.joinId.focus();
			return false;
		} else if (!regExpId.test(form.joinId.value)) {
			alert("아이디는 문자로 시작해주세요");
			form.joinId.select();
			return false;
		} else if (form.joinPw.value == "") {
			alert("비밀번호를 입력해주세요");
			form.joinPw.focus();
			return false;
		} else if (!regExpPasswd.test(form.joinPw.value)) {
			alert("비밀번호는 숫자만 입력해주세요");
			form.joinPw.focus();
			return false;
		} else if (form.joinPw2.value == "") {
			alert("비밀번호 확인을 입력해주세요");
			form.joinPw2.focus();
			return false;
		} else if (form.joinPw.value != form.joinPw2.value) {
			alert("비밀번호 확인을 다시해주세요");
			form.joinPw2.focus();
			return false;
		} else if (form.joinName.value == "") {
			alert("이름을 입력해주세요");
			form.joinName.focus();
			return false;
		} else if (!regExpName.test(form.joinName.value)) {
			alert("이름은 한글만 입력해주세요");
			form.joinName.select();
			return false;
		} else if (form.joinPhone.value == "") {
			alert("핸드폰 번호를 입력해주세요");
			form.joinPhone.focus();
			return false;
		} else if (!regExpPasswd.test(form.joinPhone.value)) {
			alert("핸드폰 번호는 숫자만 입력해주세요");
			form.joinPhone.select();
			return false;
		}
	}
</script>
</head>

<body>
	<div>
		<h1>회원가입</h1>
	</div>

	<div>
		<form id="joinForm" name="joinForm"
			action="${pageContext.request.contextPath }/joinForm" method="post"
			onsubmit="return sendIt();">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="joinId"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="joinPw"></td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="joinPw2"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="joinName"></td>
				</tr>
				<tr>
					<td>핸드폰번호</td>
					<td><input type="text" name="joinPhone"></td>
				</tr>
			</table>

			<div>
				<button type="submit">회원가입</button>
			</div>
			
		</form>
	</div>
</body>
</html>