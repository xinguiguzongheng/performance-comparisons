package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_126 {
    private final Production82_126 production = new Production82_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}