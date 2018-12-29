package com.gaetanogala.tdd;

import com.gaetanogala.entity.Rain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RainTest{

    @InjectMocks
    private Rain testRain;


    private void assertIsRainingBeahviour(boolean b, int i) {

        assertEquals(b, testRain.isRaining(i));
    }

    private void assertIsRainingListBehaviour(List<Boolean> exceptedResult, List<Integer> umidityValues) {

        assertArrayEquals(exceptedResult.toArray(), testRain.isRainingMoreZones(umidityValues).toArray());
    }


    @Test
    public void testGraterFive(){

        assertIsRainingBeahviour(true, 6);
    }

    @Test
    public void testLessEqualFive(){

        assertIsRainingBeahviour(false, 4);
    }

    /*
    * Testare sui cicli implica il dover controllare  l'esecuzione del ciclo con:
    *   Soli valori veri  - Caso coperto dal primo test
    *   Soli valori falsi - Caso coperto dai test legati al metodo isRaining utilizzato nel ciclo
    *   ed interazioni
    *       Zero
    *       Uno
    *       Più di uno - Caso coperto dal primo test
    * */
    @Test
    public void testRainingMoreZonesAllTrue(){

        assertIsRainingListBehaviour(
                new ArrayList<Boolean>(){{
                    add(true);
                    add(true);
                    add(true);
                }},
                new ArrayList<Integer>(){{
                    add(6);
                    add(7);
                    add(8);
                }});
    }

    @Test
    public void testRainingMoreZonesZeroIteractions(){

        assertIsRainingListBehaviour(new ArrayList<>(), new ArrayList<>());
    }

    @Test
    public void testRainingMoreZones(){

        assertIsRainingListBehaviour(
                new ArrayList<Boolean>(){{
                    add(true);
                }},
                new ArrayList<Integer>(){{
                    add(6);
                }});
    }
}

