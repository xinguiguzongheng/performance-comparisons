package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_119 {
    private final Production99_119 production = new Production99_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}