package com.gaetanogala;

import com.gaetanogala.entity.Product;
import com.gaetanogala.entity.ProductsBasket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EcommerceIT {

    private static ProductsBasket productsBasket;

    @BeforeAll
    public static void initIT(){

        productsBasket = new ProductsBasket();
        Product mela = new Product(), pera = new Product();
        mela.setName("mela");
        mela.setPrice(0.5);
        pera.setName("pera");
        pera.setPrice(0.3);
        productsBasket.addProduct(mela);
        productsBasket.addProduct(pera);
    }

    @Test
    public void calculateTotalPrice(){

        Assertions.assertNotEquals(0, productsBasket.getBasketPrice());
    }

    @Test
    public void printBasketState(){

        Assertions.assertNotEquals("", productsBasket.toString());
    }

}
