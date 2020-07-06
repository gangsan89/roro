var regSpacing = /\s/g;
var regID = /^[a-z0-9]{6,15}$/g;
var regPW = /^[A-Za-z0-9\!\@\#\$\%\^\&\*\(\)]{6,15}$/g;
var regName = /^[가-힣]{2,15}$/g;
var regPhone = /^01([0|1|6|7|8|9]?)([0-9]{3,4})([0-9]{4})$/g;

// 아이디 유효성 검사
$("#customerID").blur(function() {
	var customerID = $('#customerID').val();
	$.ajax({
		url : '/checkID?customerID='+ customerID,
		type : 'get',
		success : function(data) {
			console.log("1 = 중복o / 0 = 중복x : "+ data);							
			
			if (data == 1) {
				$("#checkID").text("사용중인 아이디입니다 !");
				$("#checkID").css("color", "red");
			} else {
				if(regID.test(customerID)){
					$("#checkID").text("");
				} else if(customerID == ""){
					$('#checkID').text('아이디를 입력해주세요 :)');
					$('#checkID').css('color', 'red');
				} else {
					$('#checkID').text("아이디는 소문자와 숫자 6~15자리만 가능합니다 !");
					$('#checkID').css('color', 'red');
				}
			}
		}, error : function() {
			console.log("실패");
		}
	});
})
	
// 비밀번호 유효성 검사
	// 정규식 체크
$('#customerPW').blur(function() {
	if(regPW.test($(this).val())) {
		console.log('PW true');
		$('#checkPW').text('');
	} else {
		console.log('PW false');
		$('#checkPW').text('대, 소문자 영어, 숫자, 특수문자 !, @, #, $, %, ^, &, *, (, ) 를 포함한 6~15자리');
		$('#checkPW').css('color', 'red');
	}
});
	// 비밀번호 일치 확인
$('#customerPW2').blur(function() {
	if($('#customerPW').val() != $(this).val()) {
		$('#checkPW2').text('비밀번호가 일치하지 않습니다 !');
		$('#checkPW2').css('color', 'red');
	} else {
		$('#checkPW2').text('');
	}
});

// 이름 유효성 검사
$('#customerName').blur(function() {
	if(regName.test($(this).val())){
		console.log(regName.test($(this).val()));
		console.log('name true');
		$('#checkName').text('');
	} else {
		console.log('name false');
		$('#checkName').text('이름을 확인해주세요 !');
		$('#checkName').css('color', 'red');
	}
});

// 핸드폰번호 유효성 검사
$('#customerPhoneNumber').blur(function() {
	if(regPhone.test($(this).val())){
		console.log(regPhone.test($(this).val()));
		console.log('phone true');
		$('#checkPhoneNumber').text('');
	} else {
		console.log('phone false');
		$('#checkPhoneNumber').text('핸드폰번호를 확인해주세요 !');
		$('#checkPhoneNumber').css('color', 'red');
	}
});


// 주민등록번호 유효성 검사
$('#SSNumber').blur(function(){
	var SSNumber = $('#SSNumber').val();
	$.ajax({
		url : '/checkSSNumber?SSNumber='+ SSNumber,
		type : 'get',
		success : function(data) {
			console.log("1 = 중복o / 0 = 중복x : "+ data);							
			
			if (data == 1) {
				$("#checkSSNumber").text("이미 가입된 주민등록번호 입니다 !");
				$("#checkSSNumber").css("color", "red");
			} else {
				var SSNumber1 = $('#SSNumber').val().substring(0,6)
				var SSNumber2 = $('#SSNumber').val().substring(6,13)
				
				var arrNum1 = new Array(); // 주민번호 앞자리숫자 6개를 담을 배열
				var arrNum2 = new Array(); // 주민번호 뒷자리숫자 7개를 담을 배열
			
				for (var i=0; i < SSNumber1.length; i++) {
					arrNum1[i] = SSNumber1.charAt(i);
				} // 주민번호 앞자리를 배열에 순서대로 담는다.
			
				for (var i=0; i < SSNumber2.length; i++) {
					arrNum2[i] = SSNumber2.charAt(i);
				} // 주민번호 뒷자리를 배열에 순서대로 담는다.
			
				var tempSum=0;
			
				for (var i=0; i < SSNumber1.length; i++) {
					tempSum += arrNum1[i] * (2+i);
				} // 주민번호 검사방법을 적용하여 앞 번호를 모두 계산하여 더함
			
				for (var i=0; i < SSNumber2.length-1; i++) {
					if(i>=2) {
						tempSum += arrNum2[i] * i;
					}else {
						tempSum += arrNum2[i] * (8+i);
					}
				} // 같은방식으로 앞 번호 계산한것의 합에 뒷번호 계산한것을 모두 더함
			
				if((11-(tempSum%11))%10!=arrNum2[6]) {
					$('#checkSSNumber').text('올바른 주민등록번호가 아닙니다 !');
					$('#checkSSNumber').css('color', 'red');
					SSNumber1.value = "";
					SSNumber2.value = "";
					return false;
				}else{
					$('#checkSSNumber').text('');
				}
			}
		}, error : function() {
					console.log("실패");
		}
	})
});


	

