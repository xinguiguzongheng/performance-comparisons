package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_392 {
    private final Production59_392 production = new Production59_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}