package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_350 {
    private final Production97_350 production = new Production97_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}