package se.ec.ahmedNew;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
    private AppTest calcTesting;

    @Before
    public void calc() {
        calcTesting = new AppTest();
    }

    @Test
    public void plus() {
        double expected = 10.0;
        double delta=0;
        double fnum=5.0;
        double snum=5.0;

        Assert.assertEquals(expected,App.plus(fnum,snum),delta );

    }

    @Test
    public void minus() {
        double expected = 4.0;
        double delta=0;
        double fnum=8.0;
        double snum=4.0;

        Assert.assertEquals(expected, App.minus(fnum,snum),delta);
    }

    @Test
    public void multi() {
        double expected = 25.0;
        double delta=0;
        double fnum=5.0;
        double snum=5.0;
        Assert.assertEquals(expected,App.multi(fnum,snum),delta);
    }

    @Test
    public void divide() {
        double expected = 5.0;
        double delta=0;
        double fnum=10.0;
        double snum=2.0;
        Assert.assertEquals(expected, App.divide(fnum,snum), delta);
    }


}
