package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_49 {
    private final Production64_49 production = new Production64_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}