package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_92 {
    private final Production49_92 production = new Production49_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}