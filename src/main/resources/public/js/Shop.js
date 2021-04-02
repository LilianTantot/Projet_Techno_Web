/**
 * 
 */
$(document).ready(function() {
	
	//affichage des article présent dans la table Article dans la page shop 
	$.get('http://localhost:8080/API/article',function(resp){
		$.each(resp, function(index, item){
			$('#list_article').append('<li id="article_'+item.idart+'">'+item.nom+'<br>Taille : '+item.taille+'<br>Couleur : '+item.couleur + '<br>Sexe : '+ item.sexe+ '<br> <img src="'+item.image+'"><br>Description : '+item.description+'<br><br>');
		})
	})
});