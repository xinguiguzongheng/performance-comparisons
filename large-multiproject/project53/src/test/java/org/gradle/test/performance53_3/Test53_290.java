package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_290 {
    private final Production53_290 production = new Production53_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}