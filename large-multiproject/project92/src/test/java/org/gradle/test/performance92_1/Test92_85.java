package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_85 {
    private final Production92_85 production = new Production92_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}