package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_27 {
    private final Production14_27 production = new Production14_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}