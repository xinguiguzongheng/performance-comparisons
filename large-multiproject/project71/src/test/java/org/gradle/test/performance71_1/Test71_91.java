package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_91 {
    private final Production71_91 production = new Production71_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}