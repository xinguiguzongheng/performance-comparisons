package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_310 {
    private final Production74_310 production = new Production74_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}