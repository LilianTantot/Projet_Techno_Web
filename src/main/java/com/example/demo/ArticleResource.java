package com.example.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Path("article")
public class ArticleResource {
	@Autowired
	private ArticleRepository articleRepo; 
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Article createArticle(Article a) {
		return articleRepo.save(a);
	}
	

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Article> getAllArticles() {
    	List<Article> articles = new ArrayList<>();
    	articleRepo.findAll().forEach(articles::add);
    	return articles;
	}
	
	@DELETE
    @Path("{idArticle}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteArticle(@PathParam("idArticle") Long idArticle) {
        if (articleRepo.findById(idArticle).isPresent()) {
            articleRepo.deleteById(idArticle);
        }
        return Response.noContent().build();
	}
}

