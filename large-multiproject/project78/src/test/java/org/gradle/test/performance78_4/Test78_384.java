package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_384 {
    private final Production78_384 production = new Production78_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}