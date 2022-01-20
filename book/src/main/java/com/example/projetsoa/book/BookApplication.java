package com.example.projetsoa.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookRepository bookRepository){
        return args -> {
            bookRepository.save(new Book(null, " Pourquoi le ciel est bleu ? ", " Christian Signol", AvailabilityBook.AVAILABLE));
            bookRepository.save(new Book(null, " Pourquoi le ciel est bleu ? ", " Christian Signol", AvailabilityBook.NOT_AVAILABLE));
            bookRepository.save(new Book(null, " Pourquoi le ciel est bleu ? ", " Christian Signol", AvailabilityBook.NOT_AVAILABLE));
            bookRepository.findAll().forEach(cp->{
                System.out.println(cp.getName());
                System.out.println(cp.getAvailability());
            });
        };
    }
}