package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_16 {
    private final Production90_16 production = new Production90_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}