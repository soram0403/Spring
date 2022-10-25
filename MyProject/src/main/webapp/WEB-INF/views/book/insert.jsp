<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bookinsert" method="post" onsubmit="return formOption()">
		<table>
			<tr>
				<th>도서번호</th>
				<td><input type="number" name="bookNo" value="${info.bookNo}" readonly></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="text" name="bookCovering"></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="date" name="bookDate"></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="number" name="bookPrice"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="bookPublisher"></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea rows="3" name="bookInfo"></textarea> </td>
			</tr>
		</table>
		<button type="submit">등록</button>
		<button type="button">조회</button>
	</form>
	<script>
	function formOption(){
		// 1) 도서명 입력 여부
		let tag =$('input[name="bookName"]');
		if(tag.val() == ''){
			alert("도서명이 입력되지 않았습니다.");
			tag.focus();
			return false;
		}		
		// 2) 등록 알림창 띄우기
		alert('도서 등록이 완료되었습니다.');
		return true;
	}
	</script>
</body>
</html>