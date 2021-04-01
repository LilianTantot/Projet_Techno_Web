/**
 * 
 */

$(document).ready(function() {
	
	//ici on affiche les différents article dans la table Article
	$.get('http://localhost:8080/API/article',function(resp){
		$.each(resp, function(index, item){
			$('#list-article').append('<li id="article-'+item.idart+'">'+item.nom+' '+item.taille+' '+item.couleur + ' '+ item.sexe+ ' <button class="btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >X</button></li>');
		})
	})
	
	$('#addbtnArticle').click(function(){
		let nom = $('#nom_article').val();
		let categorie = $('#categorie_article option:selected').val();
		let taille = $('#taille_article option:selected').val();
		let couleur = $('#couleur_article').val();
		let stock = $('#stock_article').val();
		let description = $('#description_article').val();
		let sexe = $('#sexe_article option:selected').val();
		let image = $('#image_article').val();
		
		
		//ici on gère la création d'un article dans la page admin
		$.ajax({
            type: "POST",
            url: "http://localhost:8080/API/article",
            data: JSON.stringify({ "nom": nom,
									"sexe": sexe,
                                    "categorie": categorie,
                                    "description": description,
                                    "taille": taille,
                                    "stock": stock,
                                    "couleur": couleur,
                                    "image": image }),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(data){
				$('#list-article').append('<li id="article-'+data.idart+'">'+data.nom+' '+data.taille+' '+data.couleur + ' '+ data.sexe+ ' <button class="btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >X</button></li>');
			},
            error: function(){console.log('error');}
        }); 	
	
		console.log("test2");
		
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
	
	
	//Ici on gère la suppression d'un article de la page admin et de la BDD
	$('#list-article').delegate("li button", "click", function() {
        let idart = $(this).parent().attr('id').replace('article-','');
        
        $.ajax({
            type: "DELETE",
            url: "http://localhost:8080/API/article/"+idart ,
            dataType: "json",
            success: function(data){
                $('#article-'+idart).remove();
            },
            error: function(){
                alert('Error while Request Processing');
            }
        });    
    });

});




