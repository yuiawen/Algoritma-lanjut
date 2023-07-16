import java.util.Scanner;

public class uts6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String provider, kuota;
        int harga = 0;

        System.out.println("\tDaftar Paket Internet");
        System.out.println("Provider\tKuota\t\tHarga");
        System.out.println("XX\t\tHAPPY 10 GB\t50.000");
        System.out.println("\t\tHAPPY 20 GB\t90.000");
        System.out.println("\t\tUL 10 GB\t55.000");
        System.out.println("\t\tUL 20 GB\t100.000");
        System.out.println("YY\t\tBAHAGIA 10 GB\t60.000");
        System.out.println("\t\tBAHAGIA 20 GB\t110.000");
        System.out.println("\t\tNONSTOP 10 GB\t65.000");
        System.out.println("\t\tNONSTOP 20 GB\t115.000");

        System.out.println();
        System.out.print("Masukkan Provider: ");
        provider = input.nextLine();

        if (provider.equalsIgnoreCase("XX")) {
            System.out.print("Masukkan Kuota: ");
            kuota = input.nextLine();

            if (kuota.equalsIgnoreCase("HAPPY 10 GB")) {
                harga = 50000;
            } else if (kuota.equalsIgnoreCase("HAPPY 20 GB")) {
                harga = 90000;
            } else if (kuota.equalsIgnoreCase("UL 10 GB")) {
                harga = 55000;
            } else if (kuota.equalsIgnoreCase("UL 20 GB")) {
                harga = 100000;
            } else {
                System.out.println("Kuota tidak ditemukan");
                System.exit(0);
            }
        } else if (provider.equalsIgnoreCase("YY")) {
            System.out.print("Masukkan Kuota: ");
            kuota = input.nextLine();

            if (kuota.equalsIgnoreCase("BAHAGIA 10 GB")) {
                harga = 60000;
            } else if (kuota.equalsIgnoreCase("BAHAGIA 20 GB")) {
                harga = 110000;
            } else if (kuota.equalsIgnoreCase("NONSTOP 10 GB")) {
                harga = 65000;
            } else if (kuota.equalsIgnoreCase("NONSTOP 20 GB")) {
                harga = 115000;
            } else {
                System.out.println("Kuota tidak ditemukan");
                System.exit(0);
            }
        } else {
            System.out.println("Provider tidak ditemukan");
            System.exit(0);
        }

        System.out.println("Harga yang harus dibayar: Rp " + harga);
        input.close();
    }

}