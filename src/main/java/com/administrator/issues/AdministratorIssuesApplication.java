package com.administrator.issues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.administrator.issues"}) // declarada en la meta anotacion de SpringBootApplication, pero si tuvieramos librerias ajenas, podriamos agregar aqui los paquetes a escanear
public class AdministratorIssuesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministratorIssuesApplication.class, args);
	}

}
