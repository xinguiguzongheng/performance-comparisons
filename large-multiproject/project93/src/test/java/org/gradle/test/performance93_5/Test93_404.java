package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_404 {
    private final Production93_404 production = new Production93_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}