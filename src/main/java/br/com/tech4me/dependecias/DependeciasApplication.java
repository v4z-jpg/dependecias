package br.com.tech4me.dependecias;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependeciasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DependeciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("mae");
		
	}

}
