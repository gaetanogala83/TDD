package com.gaetanogala.tdd;

import com.gaetanogala.tdd.entity.Product;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.*;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ProductTest {

    private Product product;

    @BeforeEach
    public void init(){

        product = new Product();
    }


    @Test
    public void assertTestGetterPrice(){

        product.setPrice(3.5);
        try {
            Assertions.assertNotEquals(0.0, product.getPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void assertExceptionIfNameIsEmpty(){

        Assertions.assertThrows(Exception.class, ()->product.getName());
    }

    @Test
    public void assertTestGetterName(){

        product.setName("Mela");
        try {
            Assertions.assertNotEquals("", product.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
