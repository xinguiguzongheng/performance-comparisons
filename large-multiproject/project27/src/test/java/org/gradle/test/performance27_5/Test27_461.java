package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_461 {
    private final Production27_461 production = new Production27_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}