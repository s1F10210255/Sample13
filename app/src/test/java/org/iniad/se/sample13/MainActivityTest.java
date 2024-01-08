package org.iniad.se.sample13;
import org.junit.Test;
import junit.framework.TestCase;

public class MainActivityTest extends TestCase {

    @Test
    public void makeResult_addition_isCorrect() {
        int radioButtonAdditionId = 2131230823;
        assertEquals("1.0 + 2.0 = 3.0", MainActivity.makeResult("1.0", "2.0", radioButtonAdditionId));
    }

    @Test
    public void makeResult_subtraction_isCorrect() {
        int radioButtonSubtractionId = 2131230824;
        assertEquals("5.0 - 2.0 = 3.0", MainActivity.makeResult("5.0", "2.0", radioButtonSubtractionId));
    }

    @Test
    public void makeResult_invalidOperation_returnsErrorMessage() {
        int noRadioButtonSelectedId = -1;
        assertEquals("Invalid operation.", MainActivity.makeResult("1.0", "2.0", noRadioButtonSelectedId));
    }

    @Test
    public void makeResult_invalidNumberFormat_returnsErrorMessage() {
        int radioButtonAdditionId = 2131230823;
        assertEquals("Invalid format.", MainActivity.makeResult("a", "2.0", radioButtonAdditionId));
}}