package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_482 {
    private final Production38_482 production = new Production38_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}