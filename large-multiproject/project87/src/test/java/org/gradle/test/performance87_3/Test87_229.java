package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_229 {
    private final Production87_229 production = new Production87_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}