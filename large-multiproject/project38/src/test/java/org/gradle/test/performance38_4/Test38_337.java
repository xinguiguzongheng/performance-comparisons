package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_337 {
    private final Production38_337 production = new Production38_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}