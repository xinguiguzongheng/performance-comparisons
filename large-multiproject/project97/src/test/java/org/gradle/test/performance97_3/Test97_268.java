package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_268 {
    private final Production97_268 production = new Production97_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}