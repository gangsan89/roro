<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
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
<script type="text/javascript">
	var IMP = window.IMP;
	function requestPay() {
		IMP.init("imp90900653");
		var data = new Array();
		$.each($('td'), function(item, value) {
			data.push($(this).val());
		});
		var now = new Date();
		var nowTime = now.getFullYear();
		nowTime += '-' + (now.getMonth() + 1);
		nowTime += '-' + now.getDate();

		IMP.request_pay({
			pg : 'card',
			pay_method : "${pay.paymentMethod}",
			merchant_uid : 'merchant_' + new Date().getTime(),
			name : $('#roomType').text(),
			amount : 100,
			buyer_email : $('#buyerEmail').text(),
			buyer_name : $('#buyerName').text(),
			buyer_tel : $('#payment.buyerTel').text(),
			buyer_addr : $('#payment.buyerAddr').text(),
			buyer_postcode : $('#payment.buyerPostcode').text(),
		}, function(rsp) {
			if (rsp.success) {
				$.ajax({
					url : '/paymentComplete',
					method : 'POST',
					dataType : 'JSON',
					data : {
						'customer.customerID' : sessionStorage
								.getItem('customerID'),
						'paymentMethod' : '${pay.paymentMethod}',
						'reservationStartDate' : $('#reservationStartDate')
								.text(),
						'reservationFinishDate' : $('#reservationFinishDate')
								.text(),
						'reservationDate' : nowTime,
						'imp_uid' : rsp.imp_uid,
						'merchant_uid' : rsp.merchant_uid,
						'totalAmount' : $('#totalAmount').text(),
						'room.roomTypeTable.roomType' : $('#roomType').text()
					},
					success : function() {
						alert("결제가 완료되었습니다.홈으로 이동합니다.");
						location.href = "/index";
					},
					error : function() {
						alert('ajax 실패')
					}

				})
			} else {
				alert("결제에 실패하였습니다. 에러 내용: " + rsp.error_msg);
			}
		});
	}
</script>
<style>
.paymentButton {
	text-align: center;
}
</style>
</head>
<body>
	<header class="header-section">
		<div class="top-nav">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<ul class="tn-left">
							<li><i class="fa fa-phone"></i> (12) 345 67890</li>
							<li><i class="fa fa-envelope"></i> abc@gmail.com</li>
						</ul>
					</div>

					<div class="col-lg-6">
						<div class="tn-right">
							<a href="javascript:void chatChannel()"> <img
								src="https://developers.kakao.com/assets/img/about/logos/channel/consult_small_yellow_pc.png" />
							</a>
							<script type='text/javascript'>
								Kakao.init('3fee6e85028ad6b8b0eef0c6b0f535e8');
								function chatChannel() {
									Kakao.Channel.chat({
										channelPublicId : '_CNxowxb'
									});
								}
							</script>
							<a href="/signUp" class="bk-btn" id="signup">회원가입</a> <a
								href="/login" class="bk-btn" id="login">로그인</a> <a
								href="/logout" class="bk-btn" id="logout">로그아웃</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="menu-item">
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
									<li class="active"><a href="/index">Home</a></li>
									<li><a href="/rooms">Rooms</a></li>
									<li><a href="/about-us">About Us</a></li>
									<li><a href="/myPage">MyPages</a>
										<ul class="dropdown">
											<li><a href="/reservationConfirm">예약확인</a></li>
											<li><a href="/customerModify">개인정보수정</a></li>
										</ul></li>

								</ul>
							</nav>
							<div class="nav-right search-switch">
								<i class="fas fa-search"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<section class="hero-section">
		<div class="container">
			<div>
				<h2>결제확인</h2>
			</div>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>결제수단</th>
						<th>예약하실객실</th>
						<th>체크인날짜</th>
						<th>체크아웃날짜</th>
						<th>총금액</th>
						<th>구매자 이메일</th>
						<th>구매자 이름</th>
						<th>구매자 전화번호</th>
						<th>구매자 주소</th>
						<th>우편번호</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td id="pg">${payment.pg}</td>
						<td id="roomType">${reser.room.roomTypeTable.roomType}</td>
						<td id="reservationStartDate">${reser.reservationStartDate}</td>
						<td id="reservationFinishDate">${reser.reservationFinishDate}</td>
						<td id="totalAmount">${reser.totalAmount}</td>
						<td id="buyerEmail">${payment.buyerEmail}</td>
						<td id="buyerName">${payment.buyerName}</td>
						<td id="buyerTel">${payment.buyerTel}</td>
						<td id="buyerAddr">${payment.buyerAddr}</td>
						<td id="buyerPostcode">${payment.buyerPostcode}</td>
					</tr>
				</tbody>
			</table>
			<div class="paymentButton">
				지금 결제하시는 금액은 예약금으로 나머지는 현장에서 결제하시면 됩니다. <br>
				<button onclick="requestPay()">결제하기</button>
			</div>
		</div>

	</section>
	<div></div>
	<footer class="footer-section">
		<div class="container">
			<div class="footer-text">
				<div class="row">
					<div class="col-lg-4">
						<div class="ft-about">
							<div class="logo">
								<a href="#"> <img
									src="${pageContext.request.contextPath}/resources/img/footer-logo.png"
									alt="">
								</a>
							</div>
							<p>
								We inspire and reach millions of travelers<br /> across 90
								local websites
							</p>

						</div>
					</div>
					<div class="col-lg-3 offset-lg-1">
						<div class="ft-contact">
							<h6>Contact Us</h6>
							<ul>
								<li>(12) 345 67890</li>
								<li>abc@gmail.com</li>
								<li>856 Cordia Extension Apt. 356, Lake, United State</li>
							</ul>
						</div>
					</div>
					<div class="col-lg-3 offset-lg-1">
						<div class="ft-newslatter">
							<h6>New latest</h6>
							<p>Get the latest updates and offers.</p>
							<form action="#" class="fn-form">
								<input type="text" placeholder="Email">
								<button type="submit">
									<i class="fa fa-send"></i>
								</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="copyright-option">
			<div class="container">
				<div class="row">
					<div class="col-lg-7">
						<ul>
							<li><a href="#">Contact</a></li>
							<li><a href="#">Terms of use</a></li>
							<li><a href="#">Privacy</a></li>
							<li><a href="#">Environmental Policy</a></li>
						</ul>
					</div>
					<div class="col-lg-5">
						<div class="co-text">
							<p>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;
								<script>
									document.write(new Date().getFullYear());
								</script>
								All rights reserved | This template is made with <i
									class="fa fa-heart" aria-hidden="true"></i> by <a
									href="https://colorlib.com" target="_blank">Colorlib</a>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
	<script type="text/javascript"
		src="https://service.iamport.kr/js/iamport.payment-1.1.2.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/soobin.js"></script>

</body>
</html>