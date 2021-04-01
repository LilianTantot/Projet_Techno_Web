package com.example.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@Path("article")
public class ArticleRessource {
	@Autowired
	private ArticleRepository articleRepo; 
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("creation")
	public Article createArticle(Article a) {
		return articleRepo.save(a);
	}
}

