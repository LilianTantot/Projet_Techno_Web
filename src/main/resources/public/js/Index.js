/**
 * 
 */

$(document).ready(function(){
	//gestion de la deconnexion d'un utilisateur lorsque l'on clique sur son pseudo
	$('#NomUsername').click(function(){
			window.sessionStorage.clear();
	});
	
	$.get("http://localhost:8080/API/article",function(resp){
  		$.each(resp,function(index,item){
    		$('#Image1').append('<img src="'+item.image+'">');
		})
	})
});
	
