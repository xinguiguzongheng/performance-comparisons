package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_137 {
    private final Production66_137 production = new Production66_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}