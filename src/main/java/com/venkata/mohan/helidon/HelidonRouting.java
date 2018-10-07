package com.venkata.mohan.helidon;

import io.helidon.webserver.Routing;
import io.helidon.webserver.WebServer;

public class HelidonRouting {
	
	public static void main(String[] args) {
		Routing routing = Routing.builder().get("/hello", (req,res) -> res.send("Hello World")).build();
		WebServer.create(routing).start();
 
	}

}
