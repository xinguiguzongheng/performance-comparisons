package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_481 {
    private final Production69_481 production = new Production69_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}