<%@page import="test.UserVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	
	ArrayList<UserVO> list = new ArrayList<UserVO>();
	list.add(new UserVO("이순신"));
	list.add(new UserVO("홍길동"));
	list.add(new UserVO("김기자"));
	request.setAttribute("userList", list);
	request.setAttribute("content", "<u>test</u>");
%>

${content}
<c:out value="${content}"/>
<c:out value="${content}" escapeXml="false"/>
<hr>

 총 인원 ${fn:length(userList)}명 입니다. <br>
 ${fn:startsWith(userList[0].username,'이')}<br>
 
<c:forEach items="${userList}" var="list" varStatus="st">
	${st.count}	${list.username}<br>
</c:forEach>

</body>
</html>