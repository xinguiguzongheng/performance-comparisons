package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_278 {
    private final Production82_278 production = new Production82_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}