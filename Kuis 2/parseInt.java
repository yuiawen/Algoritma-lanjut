import java.util.Scanner;

public class parseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        String input = scanner.nextLine();

        int number = Integer.parseInt(input);
        System.out.println("Angka yang diinput: " + number);
    }
}
