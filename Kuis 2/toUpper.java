import java.util.Scanner;

public class toUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine();

        String uppercase = input.toUpperCase();
        System.out.println("Teks dalam huruf besar: " + uppercase);
    }
}
