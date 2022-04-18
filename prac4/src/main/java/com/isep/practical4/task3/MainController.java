package com.raca.prac4.task3;

import com.raca.practical4.task3.Book;
import com.raca.practical4.task3.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private BookRepository BookRepository;



    @GetMapping(path = "/*")
    public ResponseEntity<String> error() {
        return new ResponseEntity<>("<h1>Error 404</h1>" +
                "<a href=\"/books\">Get all books</a>", HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("<h1>Welcome to the rest library</h1>" +
                " Where you can  "+
                "<a href=\"/getProducts\">List all products</a>"+
                " or "+
                "<a href=\"/getProduct?id=1\">Get product 1</a>", HttpStatus.OK);
    }

    @GetMapping(path = "/books")
    public ResponseEntity<Iterable<Book>> getBooks() {
        return new ResponseEntity<>(BookRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/book")
    public ResponseEntity<Optional<Book>> getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id) {
        return new ResponseEntity<>(BookRepository.findById(id), HttpStatus.OK);
    }

}

