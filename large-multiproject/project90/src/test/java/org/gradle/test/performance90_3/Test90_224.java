package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_224 {
    private final Production90_224 production = new Production90_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}