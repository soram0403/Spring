<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h3>회원 등록</h3>
</div>
<form action="insertUser">
	<table>
	<thead>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>가입일자</th>
			<th>닉네임</th>
			<th>연락처</th>
			<th>이메일</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><input type="text" name="userId"></td>
			<td><input type="password" name="userPassword"></td>
			<td><input type="text" name="userName"></td>
			<td><input type="date" name="userDate"></td>
			<td><input type="text" name="userNic"></td>
			<td><input type="text" name="userPhone"></td>
			<td><input type="email" name="userEmail"></td>
		</tr>
	</tbody>
	</table>
</form>
	<button type="button">등록</button>
	<button type="reset">취소</button>	
</body>
</html>