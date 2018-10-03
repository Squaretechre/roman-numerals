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
    public void convert_4_to_IIII() {
        assertCorrectConversion(4, "IIII");
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

    private void assertCorrectConversion(int arabicInteger, String romanNumeral) {
        assertEquals(romanNumeral, new ArabicInteger(arabicInteger).toRomanNumeral());
    }
}
