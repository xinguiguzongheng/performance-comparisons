package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_350 {
    private final Production68_350 production = new Production68_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}