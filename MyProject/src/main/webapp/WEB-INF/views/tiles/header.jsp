<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">

<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
<!--===============================================================================================-->

</head>
<body>
	<header>
		<!-- Header desktop -->
		<div class="container-menu-desktop">
			<!-- Topbar -->
			<div class="top-bar">
				<div class="content-topbar flex-sb-m h-full container">
					<div class="left-top-bar">
					 &nbsp;&nbsp;&nbsp;&nbsp;BookInfo
					</div>

					<div class="right-top-bar flex-w h-full">
						<a href="${pageContext.request.contextPath}" class="flex-c-m trans-04 p-lr-25">
							Home
						</a>

						<a href="booklist" class="flex-c-m trans-04 p-lr-25">
							Book
						</a>
						<a href="bookinsert" class="flex-c-m trans-04 p-lr-25">
							도서 등록
						</a>
						<a href="loginForm" class="flex-c-m trans-04 p-lr-25">
							Next
						</a>
					</div>
				</div>
			</div>

			
		</div>


	</header>
 
</body>
</html>