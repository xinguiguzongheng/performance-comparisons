package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_195 {
    private final Production82_195 production = new Production82_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}