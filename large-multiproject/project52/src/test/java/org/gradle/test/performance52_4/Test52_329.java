package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_329 {
    private final Production52_329 production = new Production52_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}