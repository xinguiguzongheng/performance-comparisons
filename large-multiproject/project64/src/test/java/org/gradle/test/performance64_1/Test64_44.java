package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_44 {
    private final Production64_44 production = new Production64_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}