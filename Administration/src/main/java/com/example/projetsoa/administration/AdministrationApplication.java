package com.example.projetsoa.administration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@EnableEurekaClient
@SpringBootApplication

public class AdministrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministrationApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AdministrationRepository administrationRepository){
        return args -> {
            administrationRepository.save(new Administration(null, "Amna", "Amna", "1234"));
            administrationRepository.save(new Administration(null, "Nadia", "Nadia", "1234"));
            administrationRepository.save(new Administration(null, " Ismail", "Ismail", "1234"));
            administrationRepository.findAll().forEach(cp->{
                System.out.println(cp.getName());
            });
        };
    }
}