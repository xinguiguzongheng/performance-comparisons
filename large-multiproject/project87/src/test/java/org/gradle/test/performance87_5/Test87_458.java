package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_458 {
    private final Production87_458 production = new Production87_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}