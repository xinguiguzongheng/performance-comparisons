package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_76 {
    private final Production37_76 production = new Production37_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}