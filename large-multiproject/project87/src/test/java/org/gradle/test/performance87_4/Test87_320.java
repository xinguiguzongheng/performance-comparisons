package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_320 {
    private final Production87_320 production = new Production87_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}