package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_296 {
    private final Production97_296 production = new Production97_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}