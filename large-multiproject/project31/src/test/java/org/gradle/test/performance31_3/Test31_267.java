package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_267 {
    private final Production31_267 production = new Production31_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}