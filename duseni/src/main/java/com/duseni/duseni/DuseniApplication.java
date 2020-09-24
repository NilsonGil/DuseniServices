package com.duseni.duseni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DuseniApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","8080");//establece el puerto de la aplicacion al 8081
		SpringApplication.run(DuseniApplication.class, args);
	}

}
