package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_109 {
    private final Production87_109 production = new Production87_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}