package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_63 {
    private final Production34_63 production = new Production34_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}