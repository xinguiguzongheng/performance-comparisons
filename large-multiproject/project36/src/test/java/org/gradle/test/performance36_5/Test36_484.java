package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_484 {
    private final Production36_484 production = new Production36_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}