package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_76 {
    private final Production85_76 production = new Production85_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}