package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_234 {
    private final Production78_234 production = new Production78_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}