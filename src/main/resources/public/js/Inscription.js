$(document).ready(function() {
	$('#addbtnClient').click(function(){
		let nom = $('#nom_input').val();
		let prenom = $('#prenom_input').val();
		let naissance = $('#naissance_input').val();
		let adresse = $('#adresse_input').val();
		let ville = $('#ville_input').val();
		let CP = $('#CP_input').val();
		let pays = $('#pays_input').val();
		let tel = $('#tel_input').val();
		let mail = $('#mail_input').val();
		let username = $('#username_input').val();
		let mdp = $('#mdp_input').val();
		let codeAdmin = false;
		console.log("Pitier marche");
		$.ajax({
		    type: "POST",
		    url: "http://localhost:8080/API/client",
		    data: JSON.stringify({ "nom": nom,
 									"prenom" : prenom,
 									"naissance": naissance,
 									"mail": mail,
 									"adresse": adresse,
 									"ville": ville,
									"pays": pays,
 									"codePostale": CP,
 									"mdp": mdp,
								 	"tel": tel,
							 		"username": username }),
		    contentType: "application/json; charset=utf-8",
		    dataType: "json",
		    success: function(data){}
		});
		
		$('#nom_input').val('');
		$('#prenom_input').val('');
		$('#naissance_input').val('');	
		$('#mail_input').val('');
		$('#adresse_input').val('');
		$('#ville_input').val('');
		$('#pays_input').val('');
		$('#CP_input').val('');
		$('#mdp_input').val('');
		$('#tel_input').val('');
		$('#username_input').val('');
		return false;
	});
});