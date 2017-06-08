package org.tw.java;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloTest {
    @Test
    public void shouldReturnHelloWord() {
        Hello hello = new Hello();
        assertTrue("heelo".equals("rh"));
    }
}