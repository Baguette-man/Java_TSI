package com.raca.prac5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping(path = "")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("<h1>Welcome to Webshop</h1>" +
                " Where you can  "+
                "<a href=\"/getProducts\">List all products</a>"+
                " or "+
                "<a href=\"/getProduct?id=1\">Get product 1</a>", HttpStatus.OK);
    }
    @GetMapping(path = "/*")
    public ResponseEntity<String> error(){
        return new ResponseEntity<>("<h1>Not Found, 404 Error</h1>" +
                "<a href=\"/getProducts\">List all products</a>"+
                " or "+
                "<a href=\"/getProduct?id=1\">Get product 1</a>", HttpStatus.NOT_FOUND);
    }

    @GetMapping(path="/getProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping(path="/getProduct")
    public ResponseEntity<Optional<Product>>getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return new ResponseEntity<>(productRepository.findById(id), HttpStatus.OK);
    }
}
