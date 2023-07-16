import java.util.Scanner;

public class uts7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah provinsi: ");
        int n = input.nextInt();

        String[][] provinsi = new String[n][1];
        int[][] jumlahPeserta = new int[n][1];

        // input data
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama provinsi ke-" + (i + 1) + ": ");
            provinsi[i][0] = input.next();
            System.out.print("Jumlah peserta dari provinsi " + provinsi[i][0] + ": ");
            jumlahPeserta[i][0] = input.nextInt();
        }

        // cetak data
        System.out.println("Data Peserta Lomba Jemparingan");
        System.out.println("---------------------------------");
        System.out.printf("| %-12s | %-12s |\n", "Provinsi", "Jumlah Peserta");
        System.out.println("---------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-13s | %-13d |\n", provinsi[i][0], jumlahPeserta[i][0]);
        }
        System.out.println("---------------------------------");

        // cetak total peserta
        int totalPeserta = 0;
        for (int i = 0; i < n; i++) {
            totalPeserta += jumlahPeserta[i][0];
        }
        System.out.printf("| %-13s | %-13d |\n", "Total", totalPeserta);
        System.out.println("---------------------------------");
        input.close();
    }
}
