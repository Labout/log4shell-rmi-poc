package com.log4j.vulnerabel.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VulnerabelLog4jApplication {

	public static void main(String[] args) {
		System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
		SpringApplication.run(VulnerabelLog4jApplication.class, args);
	}

}
