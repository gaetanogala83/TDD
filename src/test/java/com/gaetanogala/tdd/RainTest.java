package com.gaetanogala.tdd;

import com.gaetanogala.entity.Rain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RainTest{

    @InjectMocks
    private Rain testRain;

    @Test
    public void testIsRainingWithFiveSix(){

        assertTrue(testRain.isRaining(5));
    }
}
