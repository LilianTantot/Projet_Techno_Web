/**
 * 
 */

$(document).ready(function(){
	//gestion de la deconnexion d'un utilisateur lorsque l'on clique sur son pseudo
	$('#NomUsername').click(function(){
			window.sessionStorage.clear();
	});
});
	
