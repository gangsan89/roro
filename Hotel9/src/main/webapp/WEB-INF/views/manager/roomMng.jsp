<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="description" content="BitHotel Template">
<meta name="keywords" content="BitHotel, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>호텔 객실 현황</title>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<!-- Google Font -->
<link href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/a90534caa2.js" crossorigin="anonymous"></script>
<!-- Css, jquery, js -->
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
	  th, td {
   			 border: 1px solid #444444;
 		 };  		 
 		 </style>
</head>
<body>

<div class="container">
 <h2 style="text-align:center;">호텔 객실 현황 리스트</h2>
   <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#Family">Family</a></li>
    <li><a data-toggle="tab" href="#Standard">Standard</a></li>
    <li><a data-toggle="tab" href="#Dbed">Double bed</a></li>
    <li><a data-toggle="tab" href="#Premium">Premium</a></li>
    <li><a data-toggle="tab" href="#Suite">Suite</a></li>
  </ul>

  <div class="tab-content">
    <div id="Family" class="tab-pane fade in active">
      <h3>Family</h3>
      <p>
      <!-- 객실 예약 현황 리스트 -->	
	<table style= "border: 1px solid #999999;">
	<thead>
	<th>객실종류</th><th>객실번호</th><th>예약상태</th>
	</thead>
	<c:forEach items="${RoomMngDTO}" var="RoomMngDTO" varStatus="status">
	<tr>
	<td>${RoomMngDTO.roomType}</td> 
	<td>${RoomMngDTO.roomNumber}</td>
	<td>${RoomMngDTO.editState}</td>
	</tr>
	</c:forEach>
	</table>
      </p>
    </div>
    <div id="Standard" class="tab-pane fade">
      <h3>Standard</h3>
      <p>Standard room</p>
    </div>
    <div id="Dbed" class="tab-pane fade">
      <h3>Double bed</h3>
      <p>Dobule bed room</p>
    </div>
    <div id="Premium" class="tab-pane fade">
      <h3>Premium</h3>
      <p>Premium room</p>
    </div>
     <div id="Suite" class="tab-pane fade">
      <h3>Suite</h3>
      <p>Suite room</p>
    </div>    
  </div>
</div>
</body>
</html>
	
	<script>
	</script>
</body>
</html>