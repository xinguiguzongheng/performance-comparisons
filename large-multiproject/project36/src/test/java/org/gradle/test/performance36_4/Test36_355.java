package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_355 {
    private final Production36_355 production = new Production36_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}