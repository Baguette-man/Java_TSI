package com.raca.prac4.task3;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    private @Id @JsonProperty Long id;
    private @JsonProperty String author;
    private @JsonProperty String name;
    private @JsonProperty int copies;
    public Book() {}
    public Book(Long id, String author, String name, int copies){
        this.id = id;
        this.author = author;
        this.name = name;
        this.copies = copies;
    }

    public Long getId(){
        return this.id;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getCopies(){
        return this.copies;
    }
}
