package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_437 {
    private final Production19_437 production = new Production19_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}