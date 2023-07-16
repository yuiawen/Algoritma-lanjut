import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine();

        System.out.print("Masukkan indeks awal: ");
        int startIndex = scanner.nextInt();

        System.out.print("Masukkan indeks akhir: ");
        int endIndex = scanner.nextInt();

        String substring = input.substring(startIndex, endIndex);
        System.out.println("Potongan teks: " + substring);
    }
}
