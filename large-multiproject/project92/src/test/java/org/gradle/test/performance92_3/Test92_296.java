package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_296 {
    private final Production92_296 production = new Production92_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}