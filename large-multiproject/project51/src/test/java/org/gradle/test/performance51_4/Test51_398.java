package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_398 {
    private final Production51_398 production = new Production51_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}