public class Bugger {
    public static int bugger(int number) {
        if (number < 10) return 0;

        int num = 1;

        for (String i : String.valueOf(number).split("")) {
            num *= Integer.parseInt(i);
        }

        return 1 + bugger(num);
    }

    public static void main(String[] args) {
        System.out.println(bugger(39));     // 3
        System.out.println(bugger(999));    // 4
        System.out.println(bugger(4));      // 0
    }
}
