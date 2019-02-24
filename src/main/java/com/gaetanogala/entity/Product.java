package com.gaetanogala.tdd.entity;

import com.gaetanogala.tdd.interfaces.GenericProduct;

public class Product implements GenericProduct {

    private Double price;
    private String name;

    public Product(){

        price = 0.0;
        name = "";
    }


    public void setPrice(Double price) {

        this.price = price;
    }

    public Double getPrice(){

        return price;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() throws Exception {

        if(name.isEmpty())
            throw new Exception("Product's name is not setted!");

        return name;
    }

    @Override
    public String toString(){

        return String.format("Il prodotto %s ha prezzo %s", name, price);

    }
}
