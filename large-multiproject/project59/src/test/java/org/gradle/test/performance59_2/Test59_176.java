package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_176 {
    private final Production59_176 production = new Production59_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}