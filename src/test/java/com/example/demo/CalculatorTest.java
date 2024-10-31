package com.example.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "10, 21, 31",
            "5, 21, 26"
    })
    void testSum_ShouldBeSuccesfully(Integer a, Integer b, Integer expected) {
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(a, b), expected);
    }
}