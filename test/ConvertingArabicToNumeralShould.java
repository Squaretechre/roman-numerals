import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
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

    @Test
    public void convert_16_to_XVI() {
        assertCorrectConversion(16, "XVI");
    }

    @Test
    public void convert_17_to_XVII() {
        assertCorrectConversion(17, "XVII");
    }

    @Test
    public void convert_18_to_XVIII() {
        assertCorrectConversion(18, "XVIII");
    }

    @Test
    public void convert_19_to_XIX() {
        assertCorrectConversion(19, "XIX");
    }

    @Test
    public void convert_39_to_XXXIX() {
        assertCorrectConversion(39, "XXXIX");
    }

    @Test
    public void convert_40_to_XL() {
        assertCorrectConversion(40, "XL");
    }

    @Test
    public void convert_49_to_XLIX() {
        assertCorrectConversion(49, "XLIX");
    }

    @Test
    public void convert_50_to_L() {
        assertCorrectConversion(50, "L");
    }

    @Test
    @Parameters({
            "50, L",
            "51, LI",
            "52, LII",
            "53, LIII",
            "54, LIV",
            "55, LV",
            "56, LVI",
            "57, LVII",
            "58, LVIII",
            "58, LVIII",
            "59, LIX",
            "60, LX",
    })
    public void convert_numbers_50_to_60_correctly(int arabicInt, String expectedNumeral) {
        assertCorrectConversion(arabicInt, expectedNumeral);
    }

    @Test
    public void convert_89_to_LXXXIX() {
        assertCorrectConversion(89, "LXXXIX");
    }

    @Test
    @Parameters({
            "90, XC",
            "91, XCI",
            "92, XCII",
            "93, XCIII",
            "94, XCIV",
            "95, XCV",
            "96, XCVI",
            "97, XCVII",
            "98, XCVIII",
            "99, XCIX",
    })
    public void convert_numbers_90_to_99_correctly(int arabicInt, String expectedNumeral) {
        assertCorrectConversion(arabicInt, expectedNumeral);
    }

    @Test
    public void convert_100_to_C() {
        assertCorrectConversion(100, "C");
    }

    @Test
    public void convert_400_to_CD() {
        assertCorrectConversion(400, "CD");
    }

    private void assertCorrectConversion(int arabicInteger, String romanNumeral) {
        assertEquals(romanNumeral, new ArabicInteger(arabicInteger).toRomanNumeral());
    }
}
