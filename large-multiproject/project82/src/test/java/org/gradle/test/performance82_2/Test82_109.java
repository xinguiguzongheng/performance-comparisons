package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_109 {
    private final Production82_109 production = new Production82_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}