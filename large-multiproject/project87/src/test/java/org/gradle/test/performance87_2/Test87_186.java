package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_186 {
    private final Production87_186 production = new Production87_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}