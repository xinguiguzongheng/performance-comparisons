package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_474 {
    private final Production45_474 production = new Production45_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}