package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_442 {
    private final Production36_442 production = new Production36_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}