package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_415 {
    private final Production78_415 production = new Production78_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}