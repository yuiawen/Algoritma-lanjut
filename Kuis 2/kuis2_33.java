import java.util.Scanner;

public class kuis2_33 {
    public static void main(String[] args) {
        // Metode 1: Scanner.nextLine()
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String name = in.nextLine();
        System.out.println("Halo, " + name + "!");

        // Metode 2: Math.sqrt()
        double number = 16;
        double squareRoot = Math.sqrt(number);
        System.out.println("Akar kuadrat dari " + number + " adalah " + squareRoot);

        // Metode 3: String.charAt()
        String text = "Hello";
        char firstCharacter = text.charAt(0);
        System.out.println("Karakter pertama dalam teks '" + text + "' adalah " + firstCharacter);
        in.close();
    }
}
