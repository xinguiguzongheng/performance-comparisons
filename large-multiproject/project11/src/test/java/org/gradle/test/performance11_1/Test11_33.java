package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_33 {
    private final Production11_33 production = new Production11_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}