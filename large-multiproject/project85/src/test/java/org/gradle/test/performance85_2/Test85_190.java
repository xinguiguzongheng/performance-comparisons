package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_190 {
    private final Production85_190 production = new Production85_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}