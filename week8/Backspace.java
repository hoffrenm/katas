import java.util.Stack;
import java.util.stream.Collectors;

public class Backspace {
    public static String erase(String input) {
        Stack<Character> stack = new Stack<>();

        for (char character : input.toCharArray()) {
            if (!stack.isEmpty() && character == '#') {
                stack.pop();
            } else if (character != '#') {
                stack.push(character);
            }
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(erase("he##l#hel#llo"));   // hello
        System.out.println(erase("major# spar##ks")); // majo spks
        System.out.println(erase("si###t boy"));      // t boy
        System.out.println(erase("####"));            //
    }
}
