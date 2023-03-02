package br.com.cwi.hellodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
public class HellodockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodockerApplication.class, args);
	}

}
