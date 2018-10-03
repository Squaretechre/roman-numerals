import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertingArabicToNumeralShould {
    
    /*
        I = 1
        V = 5
        X = 10
        L = 50
        C = 100
        D = 500
        M = 1000
     */
    
    @Test
    public void convert_1_to_I() {
        assertCorrectConversion(1, "I");
    }

    @Test
    public void convert_2_to_II() {
        assertCorrectConversion(2, "II");
    }

    @Test
    public void convert_3_to_III() {
        assertCorrectConversion(3, "III");
    }

    @Test
    public void convert_4_to_IV() {
        assertCorrectConversion(4, "IV");
    }

    @Test
    public void convert_5_to_V() {
        assertCorrectConversion(5, "V");
    }

    @Test
    public void convert_6_to_VI() {
        assertCorrectConversion(6, "VI");
    }

    @Test
    public void convert_7_to_VII() {
        assertCorrectConversion(7, "VII");
    }

    @Test
    public void convert_8_to_VIII() {
        assertCorrectConversion(8, "VIII");
    }

    @Test
    public void convert_9_to_IX() {
        assertCorrectConversion(9, "IX");
    }

    @Test
    public void convert_10_to_X() {
        assertCorrectConversion(10, "X");
    }

    @Test
    public void convert_11_to_XI() {
        assertCorrectConversion(11, "XI");
    }

    @Test
    public void convert_12_to_XII() {
        assertCorrectConversion(12, "XII");
    }

    @Test
    public void convert_13_to_XIII() {
        assertCorrectConversion(13, "XIII");
    }

    @Test
    public void convert_14_to_XIV() {
        assertCorrectConversion(14, "XIV");
    }

    @Test
    public void convert_15_to_XV() {
        assertCorrectConversion(15, "XV");
    }

    private void assertCorrectConversion(int arabicInteger, String romanNumeral) {
        assertEquals(romanNumeral, new ArabicInteger(arabicInteger).toRomanNumeral());
    }
}
