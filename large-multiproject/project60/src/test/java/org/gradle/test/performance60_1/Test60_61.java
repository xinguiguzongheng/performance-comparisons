package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_61 {
    private final Production60_61 production = new Production60_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}