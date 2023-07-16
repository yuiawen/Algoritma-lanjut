import java.util.*;

public class kuis2_333 {
    public static void main(String[] args) {
        // Metode 1: Math.random()
        double randomNumber = Math.random();
        System.out.println("Bilangan acak antara 0 dan 1: " + randomNumber);

        // Metode 2: Random.nextInt()
        Random random = new Random();
        int randomInteger = random.nextInt(10);
        System.out.println("Bilangan bulat acak antara 0 dan 9: " + randomInteger);

        // Metode 3: String.toLowerCase()
        String text = "Hello World";
        String lowercaseText = text.toLowerCase();
        System.out.println("Teks dalam huruf kecil: " + lowercaseText);
    }
}
