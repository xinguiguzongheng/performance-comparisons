package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_37 {
    private final Production90_37 production = new Production90_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}