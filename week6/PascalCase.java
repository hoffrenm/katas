import java.util.Arrays;
import java.util.stream.Collectors;

public class PascalCase {
    public static String convert(String input) {
        return Arrays.stream(input.toLowerCase().split("\\s+"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(convert("The quick brown fox jumped over the lazy dog"));
    }
}
