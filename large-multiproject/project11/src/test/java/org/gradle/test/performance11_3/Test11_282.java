package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_282 {
    private final Production11_282 production = new Production11_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}