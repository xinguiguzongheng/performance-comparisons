package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_450 {
    private final Production71_450 production = new Production71_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}