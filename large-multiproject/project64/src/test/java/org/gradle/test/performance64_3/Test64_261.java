package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_261 {
    private final Production64_261 production = new Production64_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}