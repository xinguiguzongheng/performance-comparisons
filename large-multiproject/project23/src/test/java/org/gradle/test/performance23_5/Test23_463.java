package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_463 {
    private final Production23_463 production = new Production23_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}