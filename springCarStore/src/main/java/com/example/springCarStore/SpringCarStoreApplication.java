package com.example.springCarStore;

import com.example.springCarStore.domain.Car;
import com.example.springCarStore.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringCarStoreApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringCarStoreApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCarStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner springCarStore(CarRepository repository){
        return args -> {
            repository.save(new Car("Toyota","Camry",2012));
            repository.save(new Car("Nissan","Altima",2015));
            repository.save(new Car("Honda","Civic",2003));
            repository.save(new Car("Audi","R8",2016));
            repository.save(new Car("Tesla","S Class",2018));

            log.info("Customers found with findAll(): ");
            log.info("--------------------------------");
            for(Car car : repository.findAll()){
                log.info(car.toString());
            }
            log.info("");
        };
    }

}
