import java.util.Arrays;
import java.util.stream.Stream;

public class Disarium {
    public static boolean isDisarium(int number) {
        int[] num = Stream.of((number + "").split("")).mapToInt(Integer::parseInt).toArray();
        int value = 0;

        for (int i = 0; i < num.length; i++) {
            value += Math.pow(num[i], i + 1);
        }

        return value == number;
    }

    public static void main(String[] args) {
        System.out.println(isDisarium(75));   // false
        System.out.println(isDisarium(135));  // true
        System.out.println(isDisarium(544));  // false
        System.out.println(isDisarium(518));  // true
        System.out.println(isDisarium(8));    // true
        System.out.println(isDisarium(466));  // false
    }
}
