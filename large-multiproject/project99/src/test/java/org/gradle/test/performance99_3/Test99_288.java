package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_288 {
    private final Production99_288 production = new Production99_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}