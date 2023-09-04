package com.gen.ai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testValidPassword() {
        assertTrue(Main.validatePassword("P@ssw0rd", 20));
    }

    @Test
    public void testTooLongPassword() {
        assertFalse(Main.validatePassword("P@ssw0rdP@ssw0rdP@ssw0rdP@ssw0rd", 20));
    }

    @Test
    public void testMissingUppercase() {
        assertFalse(Main.validatePassword("p@ssw0rd", 20));
    }

    @Test
    public void testMissingLowercase() {
        assertFalse(Main.validatePassword("P@SSW0RD", 20));
    }

    @Test
    public void testMissingSpecialCharacter() {
        assertFalse(Main.validatePassword("Password123", 20));
    }

    @Test
    public void testMissingDigit() {
        assertFalse(Main.validatePassword("P@ssword", 20));
    }

    @Test
    public void testExcessWhitespace() {
        assertFalse(Main.validatePassword("P@ ss w0 rd", 20));
    }

    @Test
    public void testWhitespaceAtStart() {
        assertFalse(Main.validatePassword(" P@ssw0rd", 20));
    }

    @Test
    public void testWhitespaceAtEnd() {
        assertFalse(Main.validatePassword("P@ssw0rd ", 20));
    }

    @Test
    public void testWhitespaceInMiddle() {
        assertFalse(Main.validatePassword("P@ss w0rd", 20));
    }
}