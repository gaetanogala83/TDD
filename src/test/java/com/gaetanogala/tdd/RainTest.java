package com.gaetanogala.tdd;

import com.gaetanogala.entity.Rain;
import org.junit.Assert;
import org.junit.Test;

public class RainTest {

    private Rain rain = new Rain();

    @Test
    public void testIsRainingWithSix(){

        assertIsRainingBehaviour(true, 6);
    }

    @Test
    public void testIsRainingWithTwo(){

        assertIsRainingBehaviour(false, 2);
    }

    private void assertIsRainingBehaviour(boolean b, int i) {
        Assert.assertEquals(b, rain.isRaining(i));
    }

    /*
    * Sui cicli bosogna testare tutte le possibili combinazioni:
    *
    *   OK _ solo veri
    *   OK - solo falsi
    *       Dato che il controllo sui cicli utilizza un metodo, isRaining, già testato, allora
    *       diamo per scontati i due precedenti test.
    *   OK - zero iterazione
    *   OK - una iterazione
    *   OK - più di una iterazione
    *
    *   Dopo aver testato tutte le possibili combinazioni, facciamo refactoring della classe di test
    *
    * */

    @Test//Più di una iterazione
    public void testIsRainingArrayAllTrue(){

        assertIsRainingArrayBehaviour(new boolean[]{true, true, true}, new int[]{6, 6, 6});
    }

    @Test//Nessuna iterazione
    public void testIsRainingArrayZeroIterations(){

        assertIsRainingArrayBehaviour(new boolean[]{}, new int[]{});
    }


    @Test//Una iterazione
    public void testIsRainingArrayOneIteration(){

        assertIsRainingArrayBehaviour(new boolean[]{true}, new int[]{6});
    }

    private void assertIsRainingArrayBehaviour(boolean[] expectedResult, int[] umidity) {

        Assert.assertArrayEquals(expectedResult, rain.isRainingArray(umidity));
    }


}



