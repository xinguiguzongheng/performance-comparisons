package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_320 {
    private final Production46_320 production = new Production46_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}