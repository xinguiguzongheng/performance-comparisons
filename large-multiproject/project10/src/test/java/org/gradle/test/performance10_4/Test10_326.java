package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_326 {
    private final Production10_326 production = new Production10_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}