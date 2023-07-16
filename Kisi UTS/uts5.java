import java.util.Scanner;

public class uts5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah kabupaten : ");
        int n = input.nextInt();
        input.nextLine(); // membersihkan keyboard buffer

        String[] kabupaten = new String[n];
        int[] jumlahPeserta = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama kabupaten ke-" + (i + 1) + ": ");
            kabupaten[i] = input.nextLine();
            System.out.print("Masukkan jumlah peserta vaksinasi di " + kabupaten[i] + ": ");
            jumlahPeserta[i] = input.nextInt();
            input.nextLine(); // membersihkan keyboard buffer
            System.out.println(" ");
        }
        System.out.println("\nData peserta vaksinasi:");
        System.out.println("------------------------------");
        System.out.println("Kabupaten\tJumlah Peserta");
        System.out.println("------------------------------");
        int totalPeserta = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(kabupaten[i] + "\t\t" + jumlahPeserta[i]);
            totalPeserta += jumlahPeserta[i];
        }
        System.out.println("------------------------------");
        System.out.println("Total\t\t" + totalPeserta);
        input.close();
    }
}