<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateEmpInfo" method="post">
		<div>
			<label for="employeeId">사원번호</label>
			<input type="number" id="employeeId" name="employeeId" readonly>
		</div>
		<div>
			<label for="lastName">성</label>
			<input type="text" id="lastName" name="lastName">
		</div>
		<div>
			<label for="firstName">이름</label>
			<input type="text" id="firstName" name="firstName">
		</div>
		<div>
			<label for="email">이메일</label>
			<input type="email" id="email" name="email">
		</div>
		<div>
			<button type="submit">등록</button>
			<button type="reset">취소</button>
		</div>
	</form>
</body>
</html>