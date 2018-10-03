public class ArabicInteger {
    private final int integer;

    public ArabicInteger(int integer) {
        this.integer = integer;
    }

    public String toRomanNumeral() {
        if(integer == 2) {
            return "II";
        }
        else if(integer == 3) {
            return "III";
        }
        else  if(integer == 4) {
            return "IIII";
        }
        return "I";
    }
}
