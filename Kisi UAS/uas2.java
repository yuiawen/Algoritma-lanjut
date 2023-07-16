import java.util.Scanner;

public class uts3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Daftar Paket Internet : ");
        System.out.println("Kuota Provider XX :");
        System.out.println("1. HAPPY 10 GB");
        System.out.println("2. HAPPY 20 GB");
        System.out.println("3. UL 10 GB");
        System.out.println("4. UL 20 GB");
        System.out.println("Kuota Provider YY :");
        System.out.println("5. BAHAGIA 10 GB");
        System.out.println("6. BAHAGIA 20 GB");
        System.out.println("7. NONSTOP 10 GB");
        System.out.println("8. NONSTOP 20 GB");
        System.out.print("Pilih paket internet (1-8) : ");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Harga yang harus dibayar :  Rp 50.000");
        } else if (pilihan == 2) {
            System.out.println("Harga yang harus dibayar : Rp 90.000");
        } else if (pilihan == 3) {
            System.out.println("Harga yang harus dibayar : Rp 55.000");
        } else if (pilihan == 4) {
            System.out.println("Harga yang harus dibayar : Rp 100.000");
        } else if (pilihan == 5) {
            System.out.println("Harga yang harus dibayar : Rp 60.000");
        } else if (pilihan == 6) {
            System.out.println("Harga yang harus dibayar : Rp 110.000");
        } else if (pilihan == 7) {
            System.out.println("Harga yang harus dibayar : Rp 65.000");
        } else if (pilihan == 8) {
            System.out.println("Harga yang harus dibayar : Rp 115.000");
        } else {
            System.out.println("Tidak terdapat pilihan tersebut. Silakan pilih antara paket internet 1-8");
        }

        input.close();
    }
}
