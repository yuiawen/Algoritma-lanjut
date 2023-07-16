import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] provinsi = { "DIY", "Jawa Tengah", "Jawa Timur", "Jawa Barat" };
        int[][] jumlahPeserta = new int[4][1];

        // input jumlah peserta
        for (int i = 0; i < provinsi.length; i++) {
            System.out.print("Masukkan jumlah peserta dari provinsi " + (provinsi[i]) + " : ");
            jumlahPeserta[i][0] = input.nextInt();
        }

        // cetak jumlah peserta
        System.out.println("Data Peserta Lomba Jemparingan");
        System.out.println("-------------------------------");
        System.out.println("| Provinsi   | Jumlah Peserta |");
        System.out.println("-------------------------------");
        for (int i = 0; i < provinsi.length; i++) {
            for (int j = 0; j < provinsi.length; j++) {
                System.out.print(provinsi[i][j]);
                System.out.print("\t");
            }
        }
        System.out.println("|------------|--------------|");

        int totalPeserta = 0;
        for (int i = 0; i < provinsi.length; i++) {
            totalPeserta += jumlahPeserta[i][0];
        }
        System.out.println("| Total\t | " + totalPeserta + "\t|");

        input.close();
    }
}
