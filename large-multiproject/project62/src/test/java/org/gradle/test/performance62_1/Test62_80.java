package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_80 {
    private final Production62_80 production = new Production62_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}