package org.iniad.se.sample13;

import junit.framework.TestCase;
import org.junit.Test;

public class MainActivityTest extends TestCase {

    // 加算のテスト
    @Test
    public void makeResult_addition_isCorrect() {
        assertEquals("1.0 + 2.0 = 3.0", MainActivity.makeResult("1.0", "2.0", R.id.radioButtonAddition));
    }

    // 減算のテスト
    @Test
    public void makeResult_subtraction_isCorrect() {
        assertEquals("5.0 - 2.0 = 3.0", MainActivity.makeResult("5.0", "2.0", R.id.radioButtonSubtraction));
    }

    // 無効な操作のテスト
    @Test
    public void makeResult_invalidOperation_returnsErrorMessage() {
        assertEquals("Invalid operation.", MainActivity.makeResult("1.0", "2.0", -1));
    }

    // 無効な数値形式のテスト
    @Test
    public void makeResult_invalidNumberFormat_returnsErrorMessage() {
        assertEquals("Invalid format.", MainActivity.makeResult("a", "2.0", R.id.radioButtonAddition));
    }
}
