package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_18 {
    private final Production17_18 production = new Production17_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}