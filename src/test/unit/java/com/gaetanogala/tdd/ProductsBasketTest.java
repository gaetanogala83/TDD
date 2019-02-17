package com.gaetanogala.tdd;

import com.gaetanogala.entity.Product;
import com.gaetanogala.entity.ProductsBasket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ProductsBasketTest {

    private ProductsBasket productsBasket;
    private Product product;
    @BeforeEach
    public void init(){

        productsBasket = new ProductsBasket();
        product = new Product();
    }

    @Test
    public void assertExceptionEmptyBasket(){

        Assertions.assertThrows(Exception.class, ()->productsBasket.getBasket());
    }

    @Test
    public void assertGetBasketPrice(){

        Assertions.assertEquals(0, productsBasket.getBasketPrice());
    }

    @Test
    public void assertAddElementToBasket(){

        product.setPrice(0.5);
        product.setName("Pera");
        Assertions.assertNotEquals(0, productsBasket.addProduct(product));
    }


    @Test
    public void assertBasketPriceGreaterThanZero(){

        product.setPrice(0.5);
        product.setName("Pera");
        productsBasket.addProduct(product);
        Assertions.assertNotEquals(0, productsBasket.getBasketPrice());
    }
}
