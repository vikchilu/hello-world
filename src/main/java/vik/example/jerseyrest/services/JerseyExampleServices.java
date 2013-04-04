package vik.example.jerseyrest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import vik.example.springrest.bean.Saying;


@Path("/hello-world")
public class JerseyExampleServices {
	
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_XML })
	public Saying update(Saying saying) {
		return saying;
	}
}
