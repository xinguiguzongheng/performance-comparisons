package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_331 {
    private final Production46_331 production = new Production46_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}