package com.example.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory; //allow results to print to the console

import com.example.practice.domain.Customer;
import com.example.practice.domain.CustomerRepository;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PracticeApplication {
    private static final Logger log = LoggerFactory.getLogger(PracticeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

    @Bean
    public CommandLineRunner practice(CustomerRepository repository){
        return args -> {
            //save a couple customers
            repository.save(new Customer("Chad","Anteater"));
            repository.save(new Customer("Landon","FrenchLastName"));
            repository.save(new Customer("Chris","Bear"));
            repository.save(new Customer("Bruce","TheGoose"));

            //read all customers
            log.info("Customers found with findAll(): ");
            log.info("--------------------------------");
            for(Customer customer : repository.findAll()){
                log.info(customer.toString());
            }
            log.info("");

            //read an individual customer by ID
           repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L): ");
                        log.info("----------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            //read an individual customer by last name
            log.info("Customer found with findByLastName('TheGoose'): ");
            log.info("------------------------------------------------");
            repository.findByLastName("TheGoose").forEach(goose -> {
                log.info(goose.toString());
            });
        };
    }
}
