package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_42 {
    private final Production23_42 production = new Production23_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}