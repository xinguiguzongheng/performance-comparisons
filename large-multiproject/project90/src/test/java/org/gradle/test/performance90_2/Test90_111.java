package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_111 {
    private final Production90_111 production = new Production90_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}