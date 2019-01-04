package com.gaetanogala.tdd;

import com.gaetanogala.service.Sum;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumTest {

    private Sum sum = new Sum();

    @Test
    public void testValoreInteroASetterGetter(){

        sum.setValoreInteroA(5);
        assertEquals(Optional.of(5).get(), sum.getValoreInteroA());
    }

    @Test
    public void testValoreInteroBSetterGetter(){

        sum.setValoreInteroB(9);
        assertEquals(Optional.of(9).get(), sum.getValoreInteroB());
    }

    @Test
    public void testIntgerSum(){

        sum.setValoreInteroA(5);
        sum.setValoreInteroB(3);
        try {
            assertEquals(Optional.of(8).get(), sum.sumIntegerValues());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void exceptionThrows(){
        sum = new Sum();
        assertThrows(Exception.class, ()->sum.sumIntegerValues());
    }

    @Test
    public void exceptionThrowsSettingValueA(){
        sum = new Sum();
        sum.setValoreInteroA(10);
        assertThrows(Exception.class, ()->sum.sumIntegerValues());
    }

    @Test
    public void exceptionThrowsSettingValueB(){
        sum = new Sum();
        sum.setValoreInteroB(4);
        assertThrows(Exception.class, ()->sum.sumIntegerValues());
    }
}
