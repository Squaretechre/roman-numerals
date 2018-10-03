public class ArabicInteger {
    private final int integer;

    public ArabicInteger(int integer) {
        this.integer = integer;
    }

    public String toRomanNumeral() {
        if(integer < 5) {
           String numeralIs = "";
           for(int i=0; i < integer; i++) {
               numeralIs += "I";
           }
           return numeralIs;
        }
        else if(integer == 5) {
            return "V";
        }
        else if(integer == 6) {
            return "VI";
        }
        else {
            return "VII";
        }
    }
}
