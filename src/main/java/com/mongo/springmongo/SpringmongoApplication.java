package com.mongo.springmongo;

import com.mongo.springmongo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringmongoApplication implements CommandLineRunner {

	@Autowired
	ProductRepository groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Count of items in the database: " + groceryItemRepo.count());
	}
}
