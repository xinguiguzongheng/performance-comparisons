package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_314 {
    private final Production72_314 production = new Production72_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}