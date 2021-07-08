package com.jpa.rekha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaOneToManyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaOneToManyDemoApplication.class, args);

		//System.out.println("Hello");
	}

}
