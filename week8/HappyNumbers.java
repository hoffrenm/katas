import java.util.stream.Stream;

public class HappyNumbers {
    public static boolean happy(int number) {
        if (number == 1) return true;
        if (number == 4) return false;

        return happy((number + "").chars().map(Character::getNumericValue).map(x -> (int) Math.pow(x, 2)).sum());
    }

    public static void main(String[] args) {
        System.out.println(happy(203));  // true
        System.out.println(happy(11));   // false
        System.out.println(happy(107));  // false
    }
}
