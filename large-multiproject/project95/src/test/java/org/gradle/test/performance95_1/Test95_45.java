package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_45 {
    private final Production95_45 production = new Production95_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}