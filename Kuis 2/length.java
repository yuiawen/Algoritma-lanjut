import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("Panjang kata atau kalimat: " + length);
    }
}
