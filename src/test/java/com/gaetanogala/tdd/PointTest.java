package com.gaetanogala.tdd;

import com.gaetanogala.entity.Point;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PointTest {


    private Point point = new Point(2,3);

    @Test
    public void getXTest(){

        Assert.assertEquals(Integer.valueOf(2), point.getX());
    }

}
