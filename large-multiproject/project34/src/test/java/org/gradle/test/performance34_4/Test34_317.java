package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_317 {
    private final Production34_317 production = new Production34_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}