package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_499 {
    private final Production36_499 production = new Production36_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}