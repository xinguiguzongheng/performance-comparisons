package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_480 {
    private final Production59_480 production = new Production59_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}