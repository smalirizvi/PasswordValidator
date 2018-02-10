package com.example.smar.passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void notPassword() throws Exception {
        assertFalse(Validator.validate("PASSWORD"));
    }

    @Test
    public void passwordLength() throws Exception{
        assertFalse(Validator.validate("passwor"));
    }

    @Test
    public void passwordNoLower(){
        assertFalse(validator.validate("AFDFBSGVD"));
    }
    @Test
    public void passwordNoUpper(){
        assertFalse(validator.validate("dasfgfjsdfg"));
    }
    @Test
    public void passwordNoSpecialChar(){
        assertFalse(validator.validate("ahjf13kds"));
    }

    @Test
    public void passwordNoDigit(){
        assertFalse(validator.validate("a$asds^fds"));
    }

    @Test
    public void passwordGood(){
        assertTrue(validator.validate("Ab1^aB1$"));
    }

}