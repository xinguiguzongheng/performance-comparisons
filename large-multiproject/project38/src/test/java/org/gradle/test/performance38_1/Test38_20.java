package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_20 {
    private final Production38_20 production = new Production38_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}