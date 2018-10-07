package com.venkata.mohan.helidon;
import io.helidon.microprofile.server.Server;

public class HelidonMP {

	public static void main(String[] args) {
		Server.builder()
	       .addResourceClass(HelloWorld.class)
	       .build()
	       .start();
	}

}
