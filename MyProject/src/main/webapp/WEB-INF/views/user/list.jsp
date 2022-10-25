<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<style type="text/css">
	* {
	  box-sizing: border-box;
	}
	.row {
		display: flex;
	}
	.column{
		flex: 50%;
		width: 50%;
	}
</style>
</head>
<body>

<div id="userInfo" class="row">
	<div class="column">
		<table id="tbl1">
			<thead>
				<tr>
					<th>아이디</th>
					<th>이름</th>
					<th>가입일자</th>
					<th>연락처</th>
					<th>이메일</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr name="${user.userId }">
						<td>${user.userId }</td>
						<td>${user.userName }</td>
						<td><fmt:formatDate value="${user.userDate }" pattern="yyyy년MM월dd일"/> </td>
						<td>${user.userPhone }</td>
						<td>${user.userEmail }</td>
						<td><input type="checkbox" name="delete"> </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form id="input">
			<input type="hidden" name="userId">
		</form>
	</div>

	<div class="cloumn">
		<table id="tbl2">
			<thead>
				<tr>
					<th>아이디</th>
					<th>이름</th>
					<th>가입일자</th>
					<th>닉네임</th>
					<th>연락처</th>
					<th>이메일</th>
				</tr>
			</thead>
			<tbody id="info">
				<tr></tr>
			</tbody>
		</table>
	</div>
</div>
<div>
	<button type="button" onclick="location.href='insertForm'">회원등록</button>
</div>	

	<script type="text/javascript">
	let message = '${msg}';
	if(message != null && message !=''){
		alert(message);
	}
	$('#userInfo td').click(function(){
		let userId = $(this).parent().attr('name');
		$('#input > input').val(userId);
		console.log(userId);
	});	
	</script>
</body>
</html>