package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_174 {
    private final Production34_174 production = new Production34_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}