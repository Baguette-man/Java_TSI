package com.raca.prac4.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private  BookRepository bookRepository;
    @GetMapping(path = "/*")
    public ResponseEntity<String> error() {
        return new ResponseEntity<>("<h1>Error 404</h1>" +
                "<a href=\"/books\">Get all books</a>"+
                " or "+
                "<a href=\"/book?id=1\">Get first book</a>", HttpStatus.NOT_FOUND);
    }
    @GetMapping(path = "")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("<h1>Welcome to the Library</h1>" +
                " Where you can  "+
                "<a href=\"/books\">Get all the books</a>"+
                " or "+
                "<a href=\"/book?id=1\">Get the first book </a>", HttpStatus.OK);
    }
    @GetMapping(path="/books")
    public ResponseEntity<Iterable<Book>> getBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/book")
    public ResponseEntity<Optional<Book>> getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return new ResponseEntity<>(bookRepository.findById(id), HttpStatus.OK);
    }

}
