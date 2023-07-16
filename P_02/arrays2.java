import java.util.Scanner;

public class arrays2 {
    public static void main(String x[]) {
        Scanner in = new Scanner(System.in);
        int[] nilai = new int[6];
        int j = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("data nilai ke- " + i + "=");
            nilai[i] = in.nextInt();
            j = j + nilai[1];
        }
        float rerata = j / 5;
        System.out.println("rerata = " + rerata);
    }
}