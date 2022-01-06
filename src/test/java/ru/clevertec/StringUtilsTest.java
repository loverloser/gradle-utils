package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private final String incorrectStringWithSymbol = "q123";
    private final String incorrectStringWithMinus = "-123";
    private final String correctString = "123";

    @Test
    void isPositiveIfStringIsNotNumber() {
        assertAll(
                () -> assertFalse(StringUtils.isPositive(incorrectStringWithSymbol)),
                () -> assertFalse(StringUtils.isPositive(incorrectStringWithMinus)),
                () -> assertTrue(StringUtils.isPositive(correctString))
        );
    }
}