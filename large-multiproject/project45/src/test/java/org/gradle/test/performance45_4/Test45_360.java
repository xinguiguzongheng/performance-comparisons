package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_360 {
    private final Production45_360 production = new Production45_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}