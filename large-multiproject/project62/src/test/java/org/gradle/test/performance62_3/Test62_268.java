package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_268 {
    private final Production62_268 production = new Production62_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}