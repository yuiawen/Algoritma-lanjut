import java.util.Scanner;

public class modifRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int number = in.nextInt();
        int factorial = HitungFactorial(number);
        System.out.println("Factorial of " + number + " = " +
                factorial);
        in.close();
    }

    public static int HitungFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * HitungFactorial(n - 1);
        }
    }
}
