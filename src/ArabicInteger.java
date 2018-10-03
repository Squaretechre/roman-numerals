public class ArabicInteger {
    private static final String NumeralFor1 = "I";
    private static final String NumeralFor5 = "V";
    private final int integer;

    public ArabicInteger(int integer) {
        this.integer = integer;
    }

    public String toRomanNumeral() {
        if(integer < 4) {
           String baseNumeral = "";
            int numberOf1sToAppend = this.integer;
            return appendNumeralFor1To(baseNumeral, numberOf1sToAppend);
        }
        else if(integer == 4) {
            return "IV";
        }
        else if(integer == 5) {
            return NumeralFor5;
        }
        else if(integer < 9) {
            int numberOfIsToAdd = integer - 5;
            return appendNumeralFor1To(NumeralFor5, numberOfIsToAdd);
        }
        else if(integer == 9) {
            return "IX";
        }
        else if(integer == 10) {
            return "X";
        }
        else if(integer < 14) {
            String baseNumeral = "X";
            int numberOfIsToAdd = integer - 10;
            return appendNumeralFor1To(baseNumeral, numberOfIsToAdd);
        }
        else {
            return "XIV";
        }
    }

    private String appendNumeralFor1To(String baseNumeral, int numberOfIsToAdd) {
        for(int i = 0; i < numberOfIsToAdd; i++) {
           baseNumeral += NumeralFor1;
       }
        return baseNumeral;
    }
}
