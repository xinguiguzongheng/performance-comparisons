package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_283 {
    private final Production11_283 production = new Production11_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}