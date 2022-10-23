<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
	<form id="update" action="update" method="post"
		onsubmit="return updateBoard()">
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno" value="${board.bno }"
					readonly></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="${board.title }"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" value="${board.writer }"
					readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="3" cols="2" style="width: 100px">${board.contents }</textarea></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td><img
					src="<c:url value='/resources/images/${board.image }'/>" alt="이미지"></td>
			</tr>
			<tr>
				<th>작성일자</th>
				<td><input type="date"
					<fmt:formatDate value="${board.regDate}" pattern="yyyy년MM월dd일"/>></td>
			</tr>
		</table>
		<button type="submit">수정</button>
		<button type="button">목록</button>
	</form>
	<script>
	$(document).ready(function(){
		$('button:contains("목록")').click(function(){
			location.href="list";
		});
		$('button:contains("수정")').click(updateBoard);
	});
	
	function updateBoard(){
		return true;
	}
	</script>
</body>
</html>