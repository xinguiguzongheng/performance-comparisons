package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_42 {
    private final Production97_42 production = new Production97_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}