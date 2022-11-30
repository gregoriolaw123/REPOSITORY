package com.msClientes2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories("com.persistence.Repository")  // es para decir de donde va tomar los metos de las clases
@EntityScan("com.persistence.entity")

public class MsClientes2Application {

	public static void main(String[] args) {
		SpringApplication.run(MsClientes2Application.class, args);
	}

}
