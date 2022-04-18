package com.raca.prac5;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {
    public enum ProductCategory{
        COMPUTERS, SMARTPHONES, SMART_HOME_DEVICES;
    }
    private @Id Long id;
    private String name;
    private String description;
    private float price;
    private String pictureUrl;
    private ProductCategory productCategory;
    public Product(){}

    public Long getId(){
        return this.id;
    }
    public  String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public float getPrice(){
        return this.price;
    }
    public String getPictureUrl(){
        return this.pictureUrl;
    }
    public ProductCategory getProductCategory(){
        if (id == 1) return ProductCategory.COMPUTERS;
        if (id == 2) return ProductCategory.SMARTPHONES;
        if (id == 3) return ProductCategory.SMART_HOME_DEVICES;
        else return productCategory;
    }
}
