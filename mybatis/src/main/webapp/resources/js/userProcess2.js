$(function() {
	$('.get').on('click', function() {
				/*
				 * var dataArray = new Array(); $.each($(".input-text"),
				 * function(key, value){ dataArray.push($(this).val()+"/"); })
				 */
				const userId = $('#ibxJoinInfoRegLoginId').val();
				const userPassword = $('#ibxJoinInfoRegLoginPwd').val();
				const userBirth = $('#ibxJoinInfoRegLoginBirthConfirm').val();
				const userPhoneNum = $('#ibxJoinInfoRegLoginPhoneNum').val();
				alert(userId);
				console.log(userId);
				
				/*$(location).attr('href',
						'/getDataSignUpdata?userId=' + userId
								+ '&userPassword=' + userPassword
								+ '&userBirth=' + userBirth + '&userPhoneNum='
								+ userPhoneNum);*/
				// Json 데이터 또는 배열(PathVariable)권장
			});

	$('.post').on('click', function() {
		const form = $('#formData');
		console.log(form);
		form.serialize();
		form.submit();
	});

	$('#ibxJoinInfoRegLoginId').on('keypress', function(event) {
		check(event, '아이디');
	});

	$('#ibxJoinInfoRegLoginPwd').on('keypress', function(event) {
		check(event, '비밀번호');
	});

	$('#ibxJoinInfoRegLoginPwdConfirm').on('keyup', function(event) {
		var password = $('#ibxJoinInfoRegLoginPwd').val();
		var confirm = $('#ibxJoinInfoRegLoginPwdConfirm').val();
		var errorMsg = $(event.target).closest('tr').find('div');
		if (password != confirm) {
			errorMsg.empty();
			errorMsg.append('패스워드가 일치하지 않습니다');
			return;
		}
		errorMsg.empty();
	});

	function check(event, msg) {
		var password = $(event.target).val();
		var errorMessage = $(event.target).closest('tr').find('div');
		if (8 > (password.length + 1)) {
			//errorMessage.empty();
			errorMessage.append(msg + '는 영문,숫자 조합 8자리 이상이여야 합니다.')
			return;1
		}
		errorMessage.empty();
	}
});
