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
        assertEquals(new ArabicInteger(1).toRomanNumeral(), "I");
    }

    @Test
    public void convert_2_to_II() {
        assertEquals(new ArabicInteger(2).toRomanNumeral(), "II");
    }

    @Test
    public void convert_3_to_III() {
        assertEquals(new ArabicInteger(3).toRomanNumeral(), "III");
    }
}
