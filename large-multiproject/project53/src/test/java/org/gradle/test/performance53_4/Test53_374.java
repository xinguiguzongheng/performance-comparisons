package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_374 {
    private final Production53_374 production = new Production53_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}