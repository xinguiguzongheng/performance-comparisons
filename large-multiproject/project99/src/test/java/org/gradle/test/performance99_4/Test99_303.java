package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_303 {
    private final Production99_303 production = new Production99_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}