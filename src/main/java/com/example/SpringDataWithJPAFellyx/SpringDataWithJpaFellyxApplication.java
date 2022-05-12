package com.example.SpringDataWithJPAFellyx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

public class SpringDataWithJpaFellyxApplication {

	private static final Logger log = 
	    LoggerFactory.getLogger(SpringDataWithJpaFellyxApplication.class);
  
	    public static void main(String[] args) {
		SpringApplication.run(SpringDataWithJpaFellyxApplication.class, args);
	}
	    
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
	  return (args) -> {
	    
	  };
	}

}
