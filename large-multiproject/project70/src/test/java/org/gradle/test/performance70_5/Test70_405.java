package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_405 {
    private final Production70_405 production = new Production70_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}