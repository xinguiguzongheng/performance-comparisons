package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_269 {
    private final Production61_269 production = new Production61_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}