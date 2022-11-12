<%@page import="java.util.ArrayList"%>
<%@page import="test.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	// page < request < session < application : scope
	request.setAttribute("userInfo", new UserVO("홍길동"));
	session.setAttribute("userInfo", new UserVO("이순신"));
	
	ArrayList<UserVO> list = new ArrayList<UserVO>();
	list.add(new UserVO("이순신"));
	list.add(new UserVO("홍길동"));
	list.add(new UserVO("김기자"));
	request.setAttribute("userList", list);
%>




el내장객체 : null체크, 자동형변환
<hr>
<%=request.getParameter("name") %> : ${param.name}
<hr>
<%--=((UserVO)request.getAttribute("userInfo")).getUsername() --%> :
${requestScope.userInfo.username}
${sessionScope.userInfo.getUsername()}
<hr>

<%=request.getContextPath() %> :
${pageContext.request.contextPath}

<hr>
ip : ${pageContext.request.remoteAddr}
<hr>
<%= request.getHeader("User-Agent") %> <br> : ${header['User-Agent'] }

<hr>
${cookie.JSESSIONID.value }

<script>
	obj={name : '', age : ''} // 객체를 string으로 바꿔서 넣고 꺼낼때 다시 객체로 변환
	sessionStorage.setItem("openYn","YES") // 장바구니 할 때 유용 | 지울때는 remove
	localStorage.setItem("obj", JSON.stringify(obj))
</script>
</body>
</html>