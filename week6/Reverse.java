public class Reverse {
    public static String reverse(String string) {
        if (string.equals("")) return "";

        return string.charAt(string.length() - 1) + reverse(string.substring(0, string.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));   // olleh
        System.out.println(reverse("world"));   // dlrow
        System.out.println(reverse("a"));       // a
        System.out.println(reverse(""));        // ""
    }
}
