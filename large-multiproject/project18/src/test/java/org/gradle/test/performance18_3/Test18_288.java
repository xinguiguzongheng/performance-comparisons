package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_288 {
    private final Production18_288 production = new Production18_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}