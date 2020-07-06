<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <button onclick="cancelPay()">환불하기</button>
  <script
    src="https://code.jquery.com/jquery-3.3.1.min.js"
    integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
    crossorigin="anonymous"></script><!-- jQuery CDN --->
  <script>
    function cancelPay() {
      jQuery.ajax({
        "url": "https://www.myservice.com/payments/cancel",
        "type": "POST",
        "contentType": "application/json",
        "data": JSON.stringify({
          "merchant_uid": "mid_" + new Date().getTime(), // 주문번호
          "cancel_request_amount": 2000, // 환불금액
          "reason": "테스트 결제 환불" // 환불사유
        }),
        "dataType": "json"
      }).done(function(result) { // 환불 성공시 로직 
        alert("환불 성공");
      }).fail(function(error) { // 환불 실패시 로직
        alert("환불 실패");
      });
    }
  </script>
</body>
</html>