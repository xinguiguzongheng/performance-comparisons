package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_189 {
    private final Production27_189 production = new Production27_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}