import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan  Data SPP Variabel");
        System.out.print("SPP Teori : ");
        int sppt = in.nextInt();
        System.out.print("SPP Praktik : ");
        int sppp = in.nextInt();
        System.out.print("Jumlah SPP variabel yang harus dibayar adalah : ");
        Hitung(sppt, sppp);
    }

    public static void Hitung(float t, float p) {
        double jumlah = (p * 100000) + (t * 50000);
        System.out.println(jumlah);
    }
}
/*
 * import java.util.Scanner;
 * 
 * public class method2 {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * hitungJumlahSKS();
 * }
 * 
 * public static void hitungJumlahSKS() {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Masukkan jumlah SKS teori: ");
 * int jumlahTeori = in.nextInt();
 * System.out.print("Masukkan jumlah SKS praktik: ");
 * int jumlahPraktik = in.nextInt();
 * double sppVariabel = (jumlahPraktik * 100000) + (jumlahTeori * 50000);
 * // double sppVariabel = hitungTeori() + hitungPraktik();
 * System.out.print("Jumlah yang harus dibayar : " + sppVariabel);
 * }
 * }
 */
/*
 * public static double hitungTeori() {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Masukkan jumlah SKS teori: ");
 * int jumlahTeori = in.nextInt();
 * double teori = jumlahTeori * 50000;
 * return teori;
 * }
 * 
 * public static double hitungPraktik() {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Masukkan jumlah SKS praktik: ");
 * int jumlahPraktik = in.nextInt();
 * double praktik = jumlahPraktik * 100000;
 * return praktik;
 * }
 * }
 */
