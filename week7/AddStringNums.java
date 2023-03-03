import java.math.BigInteger;

public class AddStringNums {
    public static String addStrNums(String first, String second) {
        try {
            BigInteger value1 = first.length() > 0 ? new BigInteger(first) : new BigInteger("0");
            BigInteger value2 = second.length() > 0 ? new BigInteger(second) : new BigInteger("0");

            return value1.add(value2).toString();
        } catch (NumberFormatException e) {
            return "-1";
        }
    }

    public static void main(String[] args) {
        System.out.println(addStrNums("4", "5"));                                           // "9"
        System.out.println(addStrNums("abcdefg", "3"));                                     // "-1"
        System.out.println(addStrNums("1", ""));                                            // "1"
        System.out.println(addStrNums("12345678912334567891234567", "876543217655123"));    // "12345678913211111108889690"
    }
}
