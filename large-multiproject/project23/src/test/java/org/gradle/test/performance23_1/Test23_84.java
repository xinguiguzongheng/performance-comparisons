package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_84 {
    private final Production23_84 production = new Production23_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}