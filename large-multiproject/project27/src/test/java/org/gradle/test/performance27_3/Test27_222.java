package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_222 {
    private final Production27_222 production = new Production27_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}