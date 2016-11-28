package com.example.testerio;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RefillsTest {

    int L = 400;
    int A = 0;
    int B = 900;

    @Test
    public void checkRefillsOK1() {
        int[] x = {A, 100, 200, 375, 500, 510, 520, 530, 700, B};
        System.out.println("checkRefills OK1");
        Assert.assertEquals(2, new Refills().getMinRefills(x, L));
    }

    @Test
    public void checkRefillsFAIL1() {
        int[] x = {A, 401, 500, 510, 520, 530, 700, B};
        System.out.println("FAIL1");
        Assert.assertEquals(-1, new Refills().getMinRefills(x, L));
    }

    @Test
    public void checkRefillsOK2() {
        int[] x = {A, 400, 500, 510, 520, 530, 700, B};
        System.out.println("checkRefills OK2");
        Assert.assertEquals(2, new Refills().getMinRefills(x, L));
    }

    @Test
    public void checkRefillsFAIL2() {
        int[] x = {A, 900, B};
        System.out.println("FAIL2");
        Assert.assertEquals(-1, new Refills().getMinRefills(x, L));
    }

    @Test
    public void checkRefillsFAIL3() {
        int[] x = {A, 300, 800, B};
        System.out.println("FAIL3");
        Assert.assertEquals(-1, new Refills().getMinRefills(x, L));
    }

}