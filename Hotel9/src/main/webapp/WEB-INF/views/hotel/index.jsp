<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="description" content="BitHotel Template">
<meta name="keywords" content="BitHotel, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>BitHotel</title>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<!-- Google Font -->
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
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Offcanvas Menu Section Begin -->
	<div class="offcanvas-menu-overlay"></div>
	<div class="canvas-open">
		<i class="icon_menu"></i>
	</div>
	<div class="offcanvas-menu-wrapper">
		<div class="canvas-close">
			<i class="icon_close"></i>
		</div>
		<div class="search-icon  search-switch">
			<i class="fas fa-search"></i>
		</div>
		<nav class="mainmenu mobile-menu">
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
		<div id="mobile-menu-wrap"></div>

		<ul class="top-widget">
			<li><i class="fa fa-phone"></i> (12) 345 67890</li>
			<li><i class="fa fa-envelope"></i> abc@gmail.com</li>
		</ul>
	</div>
	<!-- Offcanvas Menu Section End -->
	<!-- Header Section Begin -->
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
							<a href="/signUp" class="bk-btn" id="signup">회원가입</a>
							<a href="/login" class="bk-btn" id="login">로그인</a> 
							<a href="/logout" class="bk-btn" id="logout">로그아웃</a>
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
							<a href="/index"> 
							<img src="${pageContext.request.contextPath}/resources/img/logo.png"
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
	<!-- Header End -->

	<!-- Hero Section Begin -->
	<section class="hero-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="hero-text">
						<h1>
							Bit. A<br>Luxury Hotel
						</h1>
						<p>Here are the best hotel booking sites, including
							recommendations for international travel and for finding
							low-priced hotel rooms.</p>
						<a href="#" class="primary-btn">Discover Now</a>
					</div>
				</div>
				<div class="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
					<div class="booking-form">
						<h3>Booking Your Hotel</h3>
						<form action="search" method="post">
							<div class="check-date">
								<label for="date-in">Check In:</label> <input type="text"
									class="date-input" id="date-in" name="reservationStartDate" required>
								<i class="icon_calendar"></i>
							</div>
							<div class="check-date">
								<label for="date-out">Check Out:</label> <input type="text"
									class="date-input" id="date-out" name="reservationFinishDate" required>
								<i class="icon_calendar"></i>
							</div>
							<div class="select-option">
								<label for="guest">Guests:</label> <select id="guest"
									name="roomPerson">
									<option value="2">2 Adults</option>
									<option value="3">3 Adults</option>
									<option value="4">4 Adults</option>
									<option value="6">6 Adults</option>
									<option value="10">10 Adults</option>
								</select>
							</div>
							<button type="submit">Check Availability</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="hero-slider owl-carousel">
			<div class="hs-item set-bg"
				data-setbg="${pageContext.request.contextPath}/resources/img/hero/hero-1.jpg"></div>
			<div class="hs-item set-bg"
				data-setbg="${pageContext.request.contextPath}/resources/img/hero/hero-2.jpg"></div>
			<div class="hs-item set-bg"
				data-setbg="${pageContext.request.contextPath}/resources/img/hero/hero-3.jpg"></div>
		</div>
	</section>
	<!-- Hero Section End -->

	<!-- About Us Section Begin -->
	<section class="aboutus-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="about-text">
						<div class="section-title">
							<span>About Us</span>
							<h2>
								Intercontinental LA <br />Westlake Hotel
							</h2>
						</div>
						<p class="f-para">BitHotel.com is a leading online
							accommodation site. We’re passionate about travel. Every day, we
							inspire and reach millions of travelers across 90 local websites
							in 41 languages.</p>
						<p class="s-para">So when it comes to booking the perfect
							hotel, vacation rental, resort, apartment, guest house, or tree
							house, we’ve got you covered.</p>
						<a href="#" class="primary-btn about-btn">Read More</a>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="about-pic">
						<div class="row">
							<div class="col-sm-6">
								<img
									src="${pageContext.request.contextPath}/resources/img/about/about-1.jpg"
									alt="">
							</div>
							<div class="col-sm-6">
								<img
									src="${pageContext.request.contextPath}/resources/img/about/about-2.jpg"
									alt="">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- About Us Section End -->

	<!-- Services Section End -->
	<section class="services-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<span>What We Do</span>
						<h2>Discover Our Services</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="fas fa-map-marker-alt fa-2x"></i>
						<h4>Travel Plan</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="fas fa-map-marked-alt fa-2x"></i>
						<h4>Catering Service</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="fas fa-baby fa-2x"></i>
						<h4>Babysitting</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="fas fa-tshirt fa-2x"></i>
						<h4>Laundry</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="far fa-clock fa-2x"></i>
						<h4>Hire Driver</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
				<div class="col-lg-4 col-sm-6">
					<div class="service-item">
						<i class="fas fa-cocktail fa-2x"></i>
						<h4>Bar & Drink</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Services Section End -->

	<!-- Home Room Section Begin -->
	<section class="hp-room-section">
		<div class="container-fluid">
			<div class="hp-room-items">
				<div class="row">
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="${pageContext.request.contextPath}/resources/img/room/room-b1.jpg">
							<div class="hr-text">
								<h3>Family Room</h3>
								<h2>
									￦15<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>30 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 6</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>King Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="${pageContext.request.contextPath}/resources/img/room/room-b2.jpg">
							<div class="hr-text">
								<h3>Double Bed Room</h3>
								<h2>
									￦50<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>50 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 3</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>Double Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="${pageContext.request.contextPath}/resources/img/room/room-b3.jpg">
							<div class="hr-text">
								<h3>Premium Room</h3>
								<h2>
									￦100<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>60 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 4</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>King Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3 col-md-6">
						<div class="hp-room-item set-bg"
							data-setbg="${pageContext.request.contextPath}/resources/img/room/room-b4.jpg">
							<div class="hr-text">
								<h3>Suite Room</h3>
								<h2>
									￦150<span>/Pernight</span>
								</h2>
								<table>
									<tbody>
										<tr>
											<td class="r-o">Size:</td>
											<td>100 ft</td>
										</tr>
										<tr>
											<td class="r-o">Capacity:</td>
											<td>Max persion 10</td>
										</tr>
										<tr>
											<td class="r-o">Bed:</td>
											<td>King Beds</td>
										</tr>
										<tr>
											<td class="r-o">Services:</td>
											<td>Wifi, Television, Bathroom,...</td>
										</tr>
									</tbody>
								</table>
								<a href="#" class="primary-btn">More Details</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Home Room Section End -->

	<!-- Testimonial Section Begin -->
	<section class="testimonial-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<span>Testimonials</span>
						<h2>What Customers Say?</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-8 offset-lg-2">
					<div class="testimonial-slider owl-carousel">
						<div class="ts-item">
							<p>After a construction project took longer than expected, my
								husband, my daughter and I needed a place to stay for a few
								nights. As a Chicago resident, we know a lot about our city,
								neighborhood and the types of housing options available and
								absolutely love our vacation at BitHotel Hotel.</p>
							<div class="ti-author">
								<div class="rating">
									<i class="fas fa-star"></i> <i class="fas fa-star"></i> <i
										class="fas fa-star"></i> <i class="fas fa-star"></i> <i
										class="fas fa-star-half-alt"></i>
								</div>
								<h5>- Alexander Vasquez</h5>
							</div>
							<img
								src="${pageContext.request.contextPath}/resources/img/testimonial-logo.png"
								alt="">
						</div>
						<div class="ts-item">
							<p>After a construction project took longer than expected, my
								husband, my daughter and I needed a place to stay for a few
								nights. As a Chicago resident, we know a lot about our city,
								neighborhood and the types of housing options available and
								absolutely love our vacation at BitHotel Hotel.</p>
							<div class="ti-author">
								<div class="rating">
									<i class="fas fa-star"></i> <i class="fas fa-star"></i> <i
										class="fas fa-star"></i> <i class="fas fa-star"></i> <i
										class="fas fa-star-half-alt"></i>
								</div>
								<h5>- Alexander Vasquez</h5>
							</div>
							<img
								src="${pageContext.request.contextPath}/resources/img/testimonial-logo.png"
								alt="">
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Testimonial Section End -->

	<!-- Blog Section Begin -->
	<section class="blog-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<span>Hotel News</span>
						<h2>Our Blog & Event</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4">
					<div class="blog-item set-bg"
						data-setbg="${pageContext.request.contextPath}/resources/img/blog/blog-1.jpg">
						<div class="bi-text">
							<span class="b-tag">Travel Trip</span>
							<h4>
								<a href="#">Tremblant In Canada</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 15th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="blog-item set-bg"
						data-setbg="${pageContext.request.contextPath}/resources/img/blog/blog-2.jpg">
						<div class="bi-text">
							<span class="b-tag">Camping</span>
							<h4>
								<a href="#">Choosing A Static Caravan</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 15th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="blog-item set-bg"
						data-setbg="${pageContext.request.contextPath}/resources/img/blog/blog-3.jpg">
						<div class="bi-text">
							<span class="b-tag">Event</span>
							<h4>
								<a href="#">Copper Canyon</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 21th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-8">
					<div class="blog-item small-size set-bg"
						data-setbg="${pageContext.request.contextPath}/resources/img/blog/blog-wide.jpg">
						<div class="bi-text">
							<span class="b-tag">Event</span>
							<h4>
								<a href="#">Trip To Iqaluit In Nunavut A Canadian Arctic
									City</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 08th April, 2019
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="blog-item small-size set-bg"
						data-setbg="${pageContext.request.contextPath}/resources/img/blog/blog-10.jpg">
						<div class="bi-text">
							<span class="b-tag">Travel</span>
							<h4>
								<a href="#">Traveling To Barcelona</a>
							</h4>
							<div class="b-time">
								<i class="icon_clock_alt"></i> 12th April, 2019
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Blog Section End -->

	<!-- Footer Section Begin -->
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
							<li><a href="/adminLogin">Admin</a></li>
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
	<!-- Footer Section End -->

	<!-- Search model Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">
				<i class="icon_close"></i>
			</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search model end -->
	<!-- Js Plugins -->
	<script>
	if(${not empty sessionScope.customerID}){
		sessionStorage.setItem( 'customerID' , '${sessionScope.customerID}' );
	}else{
		sessionStorage.removeItem('customerID');
	}
	</script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.magnific-popup.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.nice-select.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.slicknav.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/soobin.js"></script>
</body>

</html>