package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_68 {
    private final Production95_68 production = new Production95_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}