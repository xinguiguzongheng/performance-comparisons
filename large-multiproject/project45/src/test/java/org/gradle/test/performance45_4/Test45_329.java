package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_329 {
    private final Production45_329 production = new Production45_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}