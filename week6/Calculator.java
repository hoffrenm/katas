import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static Integer basicCalculator(int a, char operation, int b) {
        if (Pattern.matches("[^+-/*]", operation + "")) return null;

        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                if (b == 0) return null;
                return a / b;
            case '*':
                return a * b;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(2, '+', 4));     // 6
        System.out.println(basicCalculator(6, '-', 5));     // 1
        System.out.println(basicCalculator(12, '/', 3));    // 4
        System.out.println(basicCalculator(3, '*', 4));     // 12
        System.out.println(basicCalculator(1, '/', 0));     // null
        System.out.println(basicCalculator(2, 'x', 0));     // null
    }
}
