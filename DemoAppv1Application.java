package com.example.demoAppv1;

import com.example.demoAppv1.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppv1Application implements CommandLineRunner {

	@Autowired
	private Seller seller;

	public static void main(String[] args) {
		SpringApplication.run(DemoAppv1Application.class, args);
	}


	@Override
	public void run(String... args) {
		seller.showInfo3();
	}
}
