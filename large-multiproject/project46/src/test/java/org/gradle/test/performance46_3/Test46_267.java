package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_267 {
    private final Production46_267 production = new Production46_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}