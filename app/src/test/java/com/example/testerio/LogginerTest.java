package com.example.testerio;

import org.junit.Assert;
import org.junit.Test;

public class LogginerTest {

    @Test
    public void testing() {
        Logginer logginer = new Logginer();
        Assert.assertEquals(1, logginer.getOne());
    }

}