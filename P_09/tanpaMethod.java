import java.util.Scanner;

public class tanpaMethod {
    public static void main(String[] args) {
        int pilihan;
        Scanner in = new Scanner(System.in);
        System.out.println("Menu pilihan : ");
        System.out.println("1. Hitung Luas Lingkaran");
        System.out.println("2. Hitung Luas Segitiga");
        System.out.print("Masukkan Pilihan : ");
        pilihan = in.nextInt();

        switch (pilihan) {
            case 1: {
                System.out.println("Masukkan Jari-Jari : ");
                float jari = in.nextFloat();
                double luas = 3.14 * jari * jari;
                System.out.println("Luas Lingkaran dengan jari : " + jari + " adalah : " + luas);
            }
                break;
            case 2: {
                System.out.println("Masukkan Alas");
                float alas = in.nextFloat();
                System.out.println("Masukkan Tinggi");
                float tinggi = in.nextFloat();
                double luas = alas * tinggi * 0.5;
                System.out.println(
                        "Luas Segitiga dengan alas : " + alas + " dan tinggi : " + tinggi + " adalah : " + luas);
            }
        }
    }

}
