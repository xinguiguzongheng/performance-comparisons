package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_154 {
    private final Production38_154 production = new Production38_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}