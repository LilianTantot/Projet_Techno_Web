package com.example.demo;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("API")
@Configuration
public class JerseyConfiguration extends ResourceConfig{
	public JerseyConfiguration(){
		register(ClientRessource.class);
		register(ArticleResource.class);
	}
}
