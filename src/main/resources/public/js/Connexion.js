$(document).ready(function() {
	$('#connexionsite').click(function(){
		let username = $('#username_input').val();
		let password = $('#password_input').val();
		$.ajax({
		    type: "POST",
		    url: "http://localhost:8080/API/client/connexion",
		    data: JSON.stringify({ "username": username,
 									"password" : password,
 									 }),
		    contentType: "application/json; charset=utf-8",
		    dataType: "json",
		    success: function(data){
			console.log('data');
			window.sessionStorage.setItem('session', JSON.stringify(data));
			window.location.assign("http://localhost:8080/Index.html");
		}
		});
		
		$('#username_input').val('');
		$('#password_input').val('');
	});
});