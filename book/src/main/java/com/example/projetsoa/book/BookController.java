package com.example.projetsoa.book;

import com.example.projetsoa.book.BookRepository;
import com.example.projetsoa.book.configurations.ApplicationPropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController

public class BookController {

    private BookRepository bookRepository;
    @Autowired
    ApplicationPropertiesConfiguration applicationPropertiesConfiguration;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping(path = "/books")
    public List<Book> listBook() {
        List<Book> books = bookRepository.findAll();
        if(books.isEmpty()) {System.out.println("Aucun livre n'est disponible !");}

        List<Book> listeLimite = books.subList(0, applicationPropertiesConfiguration.getLimitDeBook());
        return listeLimite;
    }

    @GetMapping(path = "/books/{id}")
    public Book book(@PathVariable Long id) {
        return bookRepository.findById(id).get();
    }

    @PostMapping(path = "/books")
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping(path = "/books/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        book.setId(id);
        return bookRepository.save(book);
    }

    @DeleteMapping(path = "/books/{id}")
    public void delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
