package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_222 {
    private final Production49_222 production = new Production49_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}