<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table, tr, th, td {
		border : 5px solid skyblue;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<form action="updateSal" method="post">
		<table>
			<tr>
				<th>사원번호</th>
				<td><input type="number" id="employeeId" name="employeeId" value="${empInfo.employeeId}" readonly></td>
			</tr>
			<tr>
				<th>성</th>
				<td>${empInfo.lastName}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${empInfo.firstName}</td>
			</tr>
			<tr>
				<th>입사일</th>
				<td><fmt:formatDate value="${empInfo.hireDate}" pattern="yyyy년MM월dd일"/></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td>${empInfo.departmentId}</td>
			</tr>
			<tr>
				<th>직업</th>
				<td>${empInfo.jobId}</td>
			</tr>
			<tr>
				<th>급여</th>
				<td><fmt:formatNumber value="${empInfo.salary}"/> </td>
			</tr>
		</table>
		<button type="submit">연봉 인상</button>
	</form>
</body>
</html>