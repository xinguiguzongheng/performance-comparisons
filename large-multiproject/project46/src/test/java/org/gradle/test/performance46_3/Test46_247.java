package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_247 {
    private final Production46_247 production = new Production46_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}