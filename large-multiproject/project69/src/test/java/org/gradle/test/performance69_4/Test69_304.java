package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_304 {
    private final Production69_304 production = new Production69_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}