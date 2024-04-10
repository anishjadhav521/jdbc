package com.example.Jdbcproject;

import com.example.Jdbcproject.Repo.repo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcprojectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JdbcprojectApplication.class, args);

		alien a = context.getBean(alien.class);
		a.setId(100);
		a.setName("anish");

		repo repos = context.getBean(repo.class);
		repos.save(a);

	}

}
