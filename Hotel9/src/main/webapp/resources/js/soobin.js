$(function() {
	loginbtn();
});
function loginbtn() {
	var session=sessionStorage.getItem('customerID');
	$('#logout').hide();
	console.log(session);
	if ( session != null) {
		$('#signup').hide();
		$('#login').hide();
		$('#logout').show();
	};
}

