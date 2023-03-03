import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PigLatin {

    public static String translateWord(String word) {
        if (word.length() == 0) return "";

        Queue<String> chars = new ArrayDeque<>();
        for (String s : word.split("")) chars.offer(s);

        if (Pattern.matches("[aeiouAEIOU]", chars.peek())) {
            chars.offer("y");
        } else {
            while (Pattern.matches("[^aeiouAEIOU]", chars.peek())) {
                chars.offer(chars.poll());
            }
        }

        return String.join("", chars) + "ay";
    }

    public static String translateSentence(String sentence) {
        return Arrays.stream(sentence.split(" ")).map(PigLatin::translateWord).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

        System.out.println(translateWord("flag"));                                      // agflay
        System.out.println(translateWord("Apple"));                                     // Appleyay
        System.out.println(translateWord("button"));                                    // uttonbay
        System.out.println(translateWord(""));                                          //
        System.out.println(translateSentence("i like to eat honey waffles"));           // iyay ikelay otay eatyay oneyhay afflesway
        System.out.println(translateSentence("do you think it is going to rain today"));// Oday ouyay inkthay ityay isyay oinggay otay ainray odaytay
    }
}
