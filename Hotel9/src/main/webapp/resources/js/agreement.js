/*function check() {
	var checkbox = document.form.checkbox.checked;
	var num = 0;
	if (checkbox == true) {
		document.form.submit();
	} else {
		alert("개인정보 약관에 동의하셔야 합니다.");
		location.href='/signUp'
	}
	
}*/

$(document).ready(function(){
	$('#next').click(function(){
		if($('#checkbox').prop('checked') == false){
			alert("개인정보 약관에 동의하셔야 합니다.");			
		}else{
			$(location).attr('href','/agreements');
		}
	})
})




