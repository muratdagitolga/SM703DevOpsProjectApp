package org.devopsexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleAdditionTest {

    @Test
    void sumOfTwoIntegers() {
        SimpleAddition simple1 = new SimpleAddition();
        assertTrue(simple1.sumOfTwoIntegers() > 0);
    }
}