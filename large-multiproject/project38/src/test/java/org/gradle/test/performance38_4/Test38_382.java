package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_382 {
    private final Production38_382 production = new Production38_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}