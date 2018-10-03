import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicInteger {
    private static final String NumeralFor1 = "I";
    private static final String NumeralFor5 = "V";
    private static final String NumeralFor10 = "X";
    private static final String NumeralFor50 = "L";
    private static final String NumeralFor100 = "C";
    private final int integer;
    private final Map<Integer, String> numerals;

    public ArabicInteger(int integer) {
        this.integer = integer;
        this.numerals = new LinkedHashMap<Integer, String>() {
            {
                put(100, "C");
                put(90, "XC");
                put(50, "L");
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");
            }
        };
    }

    public String toRomanNumeral() {
        String numeralString = "";
        int decreasingNumber = this.integer;

        while (decreasingNumber > 0) {
            for (Map.Entry<Integer, String> numeral : numerals.entrySet()) {
                if (decreasingNumber >= numeral.getKey()) {
                    decreasingNumber -= numeral.getKey();
                    numeralString += numeral.getValue();
                    break;
                }
            }
        }

        return numeralString;
    }
}
