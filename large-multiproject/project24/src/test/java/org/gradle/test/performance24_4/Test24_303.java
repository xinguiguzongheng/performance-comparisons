package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_303 {
    private final Production24_303 production = new Production24_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}