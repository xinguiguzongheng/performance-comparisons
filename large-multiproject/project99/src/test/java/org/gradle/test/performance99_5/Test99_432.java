package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_432 {
    private final Production99_432 production = new Production99_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}