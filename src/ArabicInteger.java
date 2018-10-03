public class ArabicInteger {
    private static final String NumeralFor1 = "I";
    private static final String NumeralFor5 = "V";
    private static final String NumeralFor10 = "X";
    private final int integer;

    public ArabicInteger(int integer) {
        this.integer = integer;
    }

    public String toRomanNumeral() {
        String numeralString = "";
        int decreasingNumber = this.integer;

        while(decreasingNumber > 0) {
           if(decreasingNumber >= 10) {
               decreasingNumber -= 10;
               numeralString += NumeralFor10;
           }
           else if(decreasingNumber >= 9) {
               decreasingNumber -= 9;
               numeralString += (NumeralFor1 + NumeralFor10);
           }
           else if(decreasingNumber >= 5) {
               decreasingNumber -= 5;
               numeralString += NumeralFor5;
           }
           else if(decreasingNumber >= 4) {
               decreasingNumber -= 4;
               numeralString += NumeralFor1 + NumeralFor5;
           }
           else {
               decreasingNumber -= 1;
               numeralString += NumeralFor1;
           }
        }

        return numeralString;
    }
}
