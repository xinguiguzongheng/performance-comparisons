package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_87 {
    private final Production33_87 production = new Production33_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}