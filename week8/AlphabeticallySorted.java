import java.util.Arrays;

public class AlphabeticallySorted {
    public static boolean isAlphabeticallySorted(String sentence) {
        sentence = sentence.replaceAll("[^aA-zZ ]", "").toLowerCase();

        for (String word : sentence.split(" ")) {
            if (word.length() < 3) continue;

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);

            if (sorted.equals(word)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAlphabeticallySorted("Paula has a French accent."));            // true
        System.out.println(isAlphabeticallySorted("The biopsy returned negative results.")); // true
        System.out.println(isAlphabeticallySorted("She sells sea shells by the sea shore")); // false
    }
}
