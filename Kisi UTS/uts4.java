import java.util.Scanner;

public class uts4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] provinsi = { "DIY", "Jawa Tengah", "Jawa Timur", "Jawa Barat" };
        int[][] jumlahPeserta = new int[4][1];

        // input data
        for (int i = 0; i < provinsi.length; i++) {
            System.out.print("Jumlah peserta dari provinsi " + provinsi[i] + ": ");
            jumlahPeserta[i][0] = input.nextInt();
        }

        // cetak data
        System.out.println("Data Peserta Lomba Jemparingan");
        System.out.println("---------------------------------");
        System.out.printf("| %-12s | %-12s |\n", "Provinsi", "Jumlah Peserta");
        System.out.println("---------------------------------");
        for (int i = 0; i < provinsi.length; i++) {
            System.out.printf("| %-13s | %-13d |\n", provinsi[i], jumlahPeserta[i][0]);
        }
        System.out.println("---------------------------------");

        // cetak total peserta
        int totalPeserta = 0;
        for (int i = 0; i < provinsi.length; i++) {
            totalPeserta += jumlahPeserta[i][0];
        }
        System.out.printf("| %-13s | %-13d |\n", "Total", totalPeserta);
        System.out.println("---------------------------------");
        input.close();
    }
}