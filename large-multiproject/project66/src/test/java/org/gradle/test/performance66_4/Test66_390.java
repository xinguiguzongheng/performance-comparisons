package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_390 {
    private final Production66_390 production = new Production66_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}