package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_325 {
    private final Production91_325 production = new Production91_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}