package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_214 {
    private final Production91_214 production = new Production91_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}