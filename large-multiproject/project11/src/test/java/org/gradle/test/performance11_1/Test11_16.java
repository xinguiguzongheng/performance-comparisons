package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_16 {
    private final Production11_16 production = new Production11_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}