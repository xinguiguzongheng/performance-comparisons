package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_22 {
    private final Production52_22 production = new Production52_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}