package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_255 {
    private final Production69_255 production = new Production69_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}