package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_386 {
    private final Production65_386 production = new Production65_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}