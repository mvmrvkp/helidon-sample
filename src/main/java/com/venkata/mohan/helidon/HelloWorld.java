package com.venkata.mohan.helidon;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.metrics.annotation.Metered;

@Path("/hello")
@RequestScoped
public class HelloWorld {
	   @GET
	   @Metered
	   public String hello() {
	       return "Hello World";
	   }
}
