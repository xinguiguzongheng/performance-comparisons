package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_493 {
    private final Production78_493 production = new Production78_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}