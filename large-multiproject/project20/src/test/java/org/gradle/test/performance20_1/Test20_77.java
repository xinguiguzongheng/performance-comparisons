package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_77 {
    private final Production20_77 production = new Production20_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}