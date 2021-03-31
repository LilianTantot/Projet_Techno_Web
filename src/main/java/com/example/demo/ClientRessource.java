<<<<<<< Updated upstream
package com.example.demo;

import java.util.Optional;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Client createClient(Client c) {
		return clientRepo.save(c);
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getpersonneById(@PathParam("id") Long id) {
		Optional<Client> c = clientRepo.findById(id);
		if (c.isPresent()) {
			return Response.ok(c.get()).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
}
=======
package com.example.demo;

import java.util.Optional;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Client createClient(Client c) {
		return clientRepo.save(c);
	}
}
>>>>>>> Stashed changes
