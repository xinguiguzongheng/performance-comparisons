package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_47 {
    private final Production62_47 production = new Production62_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}