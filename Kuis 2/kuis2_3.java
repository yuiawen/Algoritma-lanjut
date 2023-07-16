public class kuis2_3 {
    public static void main(String[] args) {
        String text = "Hello, world";

        // Metode 1: length()
        int length = text.length();
        System.out.println("Panjang teks: " + length);

        // Metode 2: toUpperCase()
        String upperCaseText = text.toUpperCase();
        System.out.println("Teks dalam huruf besar: " + upperCaseText);

        // Metode 3: substring()
        String substring = text.substring(7);
        System.out.println("Substring mulai dari indeks 7: " + substring);
    }
}
