package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_99 {
    private final Production52_99 production = new Production52_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}