package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_323 {
    private final Production64_323 production = new Production64_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}