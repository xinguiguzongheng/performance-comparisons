package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_92 {
    private final Production70_92 production = new Production70_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}