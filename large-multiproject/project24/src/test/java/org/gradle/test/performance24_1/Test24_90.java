package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_90 {
    private final Production24_90 production = new Production24_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}