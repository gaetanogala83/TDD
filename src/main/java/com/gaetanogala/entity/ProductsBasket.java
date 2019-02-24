package com.gaetanogala.tdd.entity;

import com.gaetanogala.tdd.interfaces.GenericProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductsBasket implements GenericProduct {

    private List<GenericProduct> basket;
    private Double basketPrice;

    public ProductsBasket(){

        basket = new ArrayList<>();
        basketPrice = 0.0;
    }

    public List<GenericProduct> getBasket() throws Exception{

        if(basket.isEmpty())
            throw new Exception("There aren't products in this basket!");

        return basket;
    }

    public Integer addProduct(GenericProduct product){

        basket.add(product);
        return basket.size();
    }

    public Double getBasketPrice() {

        basket.forEach(genericProduct -> basketPrice += ((Product) genericProduct).getPrice());

        return basketPrice;
    }

    @Override
    public String toString(){

        return String.format("Il cesto contiene %s prodotti per un prezzo di %s", basket.size(), getBasketPrice());
    }
}
