package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_55 {
    private final Production90_55 production = new Production90_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}