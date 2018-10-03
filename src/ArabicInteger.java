public class ArabicInteger {
    private static final String NumeralFor1 = "I";
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
            return "V";
        }
        else if(integer < 9) {
            String baseNumeral = "V";
            int numberOfIsToAdd = integer - 5;
            return appendNumeralFor1To(baseNumeral, numberOfIsToAdd);
        }
        else if(integer == 9) {
            return "IX";
        }
        else if(integer == 10) {
            return "X";
        }
        else if(integer == 11) {
            return "XI";
        }
        else if(integer == 12) {
            return "XII";
        }
        else if(integer == 13) {
            return "XIII";
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
