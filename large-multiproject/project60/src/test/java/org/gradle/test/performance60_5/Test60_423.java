package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_423 {
    private final Production60_423 production = new Production60_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}