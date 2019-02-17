package com.gaetanogala.tdd;

import com.gaetanogala.entity.Sum;
import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class SumTest {

    private Sum sumTest;

    @BeforeEach
    public void init(){
        sumTest = new Sum();
    }

    @Test
    public void testASetter(){

        sumTest.setA(5);
        Assert.assertEquals(5, sumTest.getA());
    }

    @Test
    public void testBSetter(){

        sumTest.setB(5);
        Assert.assertEquals(5, sumTest.getB());
    }

    @Test
    public void testSumMethod(){

        sumTest.setA(5);
        sumTest.setB(4);
        try {
            Assert.assertEquals(9, sumTest.sum());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void assertExceptionThrows(){

        Assertions.assertThrows(Exception.class, ()->sumTest.sum());
    }

    @Test
    public void assertExceptionThrowsASetted(){

        sumTest.setA(20);
        Assertions.assertThrows(Exception.class, ()->sumTest.sum());
    }

    @Test
    public void assertExceptionThrowsBSetted(){

        sumTest.setB(10);
        Assertions.assertThrows(Exception.class, ()->sumTest.sum());
    }
}
