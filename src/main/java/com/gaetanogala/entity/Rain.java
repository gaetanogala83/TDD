package com.gaetanogala.entity;

import java.util.ArrayList;
import java.util.List;

public class Rain {

    public boolean isRaining(int i) {

        return (i>5);
    }

    public List<Boolean> isRainingMoreZones(List<Integer> umidityValues) {

        return new ArrayList<Boolean>(){{umidityValues.forEach(integer -> add(isRaining(integer)));}};
    }
}
