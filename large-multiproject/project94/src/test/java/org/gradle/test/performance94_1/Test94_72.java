package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_72 {
    private final Production94_72 production = new Production94_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}