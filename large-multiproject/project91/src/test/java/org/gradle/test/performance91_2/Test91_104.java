package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_104 {
    private final Production91_104 production = new Production91_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}