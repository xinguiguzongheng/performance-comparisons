package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_28 {
    private final Production97_28 production = new Production97_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}