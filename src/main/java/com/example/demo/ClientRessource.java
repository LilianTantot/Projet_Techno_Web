package com.example.demo;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

@Path("client")
public class ClientRessource {
	@Autowired
	private ClientRepository clientRepo; 
	
	//webservice servant à créer un client
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("inscription")
	public Client createClient(Client c) {
		return clientRepo.save(c);
	}
	
	//webservice servant à gérer la connexion d'un utilisateur
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("connexion")
	public Response getLogin(LoginInput li) {
		Optional<Client> optc = clientRepo.findByUsernameAndMdp(li.getUsername(), li.getPassword());
		if(!optc.isPresent()) return Response.status(Response.Status.NOT_FOUND).build();
		
		return Response.ok(optc.get()).build();
	}
}
