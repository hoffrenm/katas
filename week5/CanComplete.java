public class CanComplete {

    static public boolean canComplete(String sub, String str) {
        int i = 0;

        for (char c : str.toCharArray()) {
            if (sub.charAt(i) == c) i++;

            if (i == sub.length()) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful"));   // true
        System.out.println(canComplete("butlz", "beautiful"));  // false
        System.out.println(canComplete("tulb", "beautiful"));   // false
        System.out.println(canComplete("bbutl", "beautiful"));  // false
    }
}
