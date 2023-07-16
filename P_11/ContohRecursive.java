public class ContohRecursive {
    public static void main(String[] args) {
        int number = 5;
        int factorial = HitungFactorial(number);
        System.out.println("Factorial of " + number + " = " +
                factorial);
    }

    public static int HitungFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * HitungFactorial(n - 1);
        }
    }
}
