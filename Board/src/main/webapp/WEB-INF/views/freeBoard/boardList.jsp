<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
</head>
<body>
	<div id="delete">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>삭제</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${boardList }" var="board">
					<tr name="${board.bno}">
						<td>${board.bno}</td>
						<td>${board.title}</td>
						<td>${board.writer}</td>
						<td><fmt:formatDate value="${board.regDate}" pattern="yyyy년MM월dd일"/></td>
						<td><button>삭제</button>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<form id="info">
	<input type="hidden" name="bno">
</form>


	<script>
		let resultMsg = '${msg}';
		if(resultMsg != null && resultMsg != ""){
			alert(resultMsg);
		}
		$('#delete tr td').click(function(){
			let bno = $(this).parent().attr('name');

			$('#info > input').val(bno);
			$('#info').prop('action','info')
					   .prop('method','get').submit();
		});	
		
		$('#delete tr td > button').on('click', function(){
			
			let bno = $(this).closest('tr').attr('name');
			
			$.ajax({
				url : 'delete/' + bno,
				success : function(data){
					console.log(data);

					let tr = $(this).closest('tr');
					$(tr).remove();
				},
				error : function(reject){
					console.log(reject);
				}
			});
			return false;
		});
		
	</script>
</body>
</html>