package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_295 {
    private final Production66_295 production = new Production66_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}