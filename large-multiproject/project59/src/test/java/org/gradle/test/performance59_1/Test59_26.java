package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_26 {
    private final Production59_26 production = new Production59_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}