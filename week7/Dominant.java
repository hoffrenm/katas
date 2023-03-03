import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Dominant {
    public static boolean isPositiveDominant(int[] values) {
        Set<Integer> uniques = new HashSet<>(List.of(IntStream.of(values).boxed().toArray(Integer[]::new)));
        int count = 0;

        for (int i : uniques) {
            if (i > 0) count++;
            if (i < 0) count--;
        }

        return count > 0;
    }

    public static void main(String[] args) {
        System.out.println(isPositiveDominant(new int[]{1, 1, 1, 1, -3, -4}));  // false
        System.out.println(isPositiveDominant(new int[]{5, 99, 832, -3, -4}));  // true
        System.out.println(isPositiveDominant(new int[]{0, -4, -3}));           // false
    }
}
