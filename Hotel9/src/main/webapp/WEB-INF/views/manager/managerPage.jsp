<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>호텔 객실 변경</title>
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/a90534caa2.js"
	crossorigin="anonymous"></script>

<!-- Css Styles -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/elegant-icons.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/flaticon.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/nice-select.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/jquery-ui.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/magnific-popup.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/slicknav.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	type="text/css">
</head>
<body>
<header class="header-section">
		<div class="menu-item menu-item-manager"><!-- style="background-color:#dfa974;"-->
			<div class="container">
				<div class="row">
					<div class="col-lg-2">
						<div class="logo">
							<a href="/index"> <img
								src="${pageContext.request.contextPath}/resources/img/logo.png"
								alt="">
							</a>
						</div>
					</div>
					<div class="col-lg-10">
						<div class="nav-menu">
							<nav class="mainmenu">
								<ul>
								<li class="active"><a href="rsrvlist">예약리스트</a></li>	
								<li class="active"><a href="/roomng" onclick="window.open(this.href,'객실 예약 현황 리스트','width=800, height=600, location=no, status=no, scrollbars=yes'); return false;">객실관리</a></li>
								<li class="active"><a href="/productPriceChange">가격변경</a></li>	
									</ul>
							</nav>       					
						</div>
					</div>
				</div>
			</div>
		</div>    		
	</header>
	<br>
	<h2 class="contact-text" align="center">호텔 객실 가격 변경</h2>
	<br><br><br>
	<table align="center"> <!-- style= "margin:auto; text-align:center;" -->
		<thead>
			<tr>
				<th>객실</th>
				<th>변경할 가격</th>
				<th>변경</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="room" items="${rooms}">
				<form action="/priceChangeProcess" method="post" class="contact-form">
					<tr>
						<td>${room.roomTypeTable.roomType}</td>
						<td><input type="number" name="roomPrice" value="${room.roomPrice}">
							<input type="hidden" name="roomTypeTable.roomType" value='${room.roomTypeTable.roomType}'>
						</td>
						<td><button type="submit" class="bk-btn">변경</button></td>
					</tr>
				</form>
			</c:forEach>
						
			
		</tbody>
	</table>
	
	
	
	
	
	
	<%-- <h2 style="text-align:center;">호텔 객실 가격 변경</h2>
	<br>
	<table style= "margin:auto; text-align:center;">
	<thead>
	<tr>
	<th>객실</th>
	<th>가격</th>
	<th>변경할 가격</th>
	<th>변경</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="roomType" items="${roomType}">
		<form action="/productPriceChange" method="post" style="text-align:center;">
		<tr>
		<td>${roomType.roomTypeTable.roomType}</td>
		<td>${roomType.roomPrice}</td>
		<td><input type="number"></td>
		<td><button type="submit">변경</button></td>
		</tr>
		</form>
	</c:forEach>
	</tbody>
	</table> --%>
</body>
</html>