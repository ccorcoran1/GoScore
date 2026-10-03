package com.GoScore.GoScore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.GoScore.GoScore.repositories")
public class GoScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoScoreApplication.class, args);
	}

}
