package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_347 {
    private final Production70_347 production = new Production70_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}