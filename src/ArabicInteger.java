public class ArabicInteger {
    private final int integer;

    public ArabicInteger(int integer) {
        this.integer = integer;
    }

    public String toRomanNumeral() {
        if(integer < 5) {
           String numeral = "";
            int numberOfIsToAdd = this.integer;
            for(int i = 0; i < numberOfIsToAdd; i++) {
               numeral += "I";
           }
           return numeral;
        }
        else if(integer == 5) {
            return "V";
        }
        else if(integer > 5 && integer < 9) {
            String numeral = "V";
            int numberOfIsToAdd = integer - 5;
            for(int i = 0; i < numberOfIsToAdd; i++) {
                numeral += "I";
            }
            return numeral;
        }
        else {
            return "IX";
        }
    }
}
