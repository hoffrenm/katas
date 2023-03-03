public class PrimeNumbers {
    public static int primeNumbers(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) count++;
        }

        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumbers(10)); // 4
        System.out.println(primeNumbers(20)); // 8
        System.out.println(primeNumbers(30)); // 10
    }
}

