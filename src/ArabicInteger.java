public class ArabicInteger {
    private final int integer;

    public ArabicInteger(int integer) {
        this.integer = integer;
    }

    public String toRomanNumeral() {
        if(integer < 5) {
           String baseNumeral = "";
            int numberOf1sToAppend = this.integer;
            return appendNumeralFor1To(baseNumeral, numberOf1sToAppend);
        }
        else if(integer == 5) {
            return "V";
        }
        else if(integer > 5 && integer < 9) {
            String baseNumeral = "V";
            int numberOfIsToAdd = integer - 5;
            return appendNumeralFor1To(baseNumeral, numberOfIsToAdd);
        }
        else {
            return "IX";
        }
    }

    private String appendNumeralFor1To(String numeral, int numberOfIsToAdd) {
        for(int i = 0; i < numberOfIsToAdd; i++) {
           numeral += "I";
       }
        return numeral;
    }
}
