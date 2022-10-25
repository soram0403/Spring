<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
<div>
	<h3>관리자 로그인</h3>
</div>
<br><br>
<form action="login" method="post">
	<table>
		<tr>
			<th>아이디</th>
			<td><input type="text" name="userId"></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="text" name="userPassword"></td>
		</tr>
	</table>
	<button type="submit">로그인</button>
	<button type="reset">취소</button>
	<button type="button">목록</button>
</form>
<script>
	
</script>	
</body>
</html>