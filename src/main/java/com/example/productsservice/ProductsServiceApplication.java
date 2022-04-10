package com.example.productsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class ProductsServiceApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ProductsServiceApplication.class, args);
		SpringApplication application = new SpringApplication(ProductsServiceApplication.class);
		application.addListeners(new ApplicationPidFileWriter("./bin/app.pid"));
		application.run(args);
	}

}
