package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_14 {
    private final Production74_14 production = new Production74_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}