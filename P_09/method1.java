import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pilihanMethod();
    }

    public static void pilihanMethod() {
        Scanner in = new Scanner(System.in);
        int pilihan;
        System.out.println("Menu pilihan : ");
        System.out.println("1. Hitung Luas Lingkaran");
        System.out.println("2. Hitung Luas Segitiga");
        System.out.print("Masukkan Pilihan : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                hitungLingkaran();
                break;
            case 2:
                hitungSegitiga();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    public static void hitungLingkaran() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari : ");
        float jari = in.nextFloat();
        double luas = 3.14 * jari * jari;
        System.out.println("Luas Lingkaran dengan jari : " + jari + " adalah : " + luas);
    }

    public static void hitungSegitiga() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Alas : ");
        float alas = in.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        float tinggi = in.nextFloat();
        double luas = alas * tinggi * 0.5;
        System.out.println(
                "Luas Segitiga dengan alas : " + alas + " dan tinggi : " + tinggi + " adalah : " + luas);
    }

}
