package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_336 {
    private final Production60_336 production = new Production60_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}