import java.util.Scanner;

public class toLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine();

        String lowercase = input.toLowerCase();
        System.out.println("Teks dalam huruf kecil: " + lowercase);
    }
}
