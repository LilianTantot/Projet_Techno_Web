/**
 * 
 */

$(document).ready(function() {
	$('#addbtnArticle').click(function(){
		let nom = $('#nom_article').val();
		let categorie = $('#categorie_article').val();
		let taille = $('#taille_article').val();
		let couleur = $('#couleur_article').val();
		let stock = $('#stock_article').val();
		let description = $('#description_article').val();
		let sexe = $('#sexe_article').val();
		let image = $('#image_article').val();

		$.ajax({
		    type: "POST",
		    url: "http://localhost:8080/api/personnes", //a changer
		    data: JSON.stringify({ "nom": nom,
 									"sexe" : sexe,
 									"categorie": categorie,
 									"description": description,
 									"taille": taille,
 									"stock": stock,
 									"couleur": couleur,
 									"image": image }),
		    contentType: "application/json; charset=utf-8",
		    dataType: "json",
		    success: function(data){ appendToListPersonne(data) } // a changer
		});
		
		$('#nom_article').val('');
		$('#categorie_article').val('');
		$('#taille_article').val('');	
		$('#couleur_article').val('');
		$('#stock_article').val('');
		$('#description_article').val('');
		$('#sexe_article').val('');
		$('#image_article').val('');
		return false;
	});
});