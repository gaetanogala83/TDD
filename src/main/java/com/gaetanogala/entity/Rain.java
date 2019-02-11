package com.gaetanogala.entity;

public class Rain {

    public boolean isRaining(int i) {

        return (i>5);
    }

    public boolean[] isRainingArray(int[] umidity) {

        boolean[] response = new boolean[umidity.length];
        for (int i=0; i < umidity.length; i++)
            response[i] = isRaining(umidity[i]);

        return response;
    }
}
