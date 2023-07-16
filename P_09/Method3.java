import java.util.Scanner;

public class Method3 {
    public void hitungPotongan(int pilihan) {
        double spa = 10000000;
        Scanner in = new Scanner(System.in);
        if (pilihan == 1) {
            System.out.print("Masukkan Nilai Raport : ");
            double raport = in.nextDouble();
            if (raport >= 8) {
                double potongan = spa * 0.2;
                double jumlahBayar = spa - potongan;
                System.out.print("Jumlah SPA yang harus dibayar : " + jumlahBayar);
            }
        }

        if (pilihan == 2) {
            System.out.print("Masukkan Nilai UAN : ");
            double uan = in.nextDouble();
            if (uan >= 8) {
                double potongan = spa * 0.3;
                double jumlahBayar = spa - potongan;
                System.out.print("Jumlah SPA yang harus dibayar : " + jumlahBayar);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Biaya pengembangan Akademik : 10.000.000");
        System.out.println("Jenis Potongan : ");
        System.out.println("1. Nilai raport");
        System.out.println("2. Nilai uan");
        System.out.print("Masukkan Pilihan Potongan : ");
        int pilihan = in.nextInt();
        Method3 a = new Method3();
        a.hitungPotongan(pilihan);
    }
}
