import java.util.Scanner;

public class UAS_1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int mhs, jml, nilai[], ntt, ntr;
        float rata, jumlah = 0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mhs = input.nextInt();
        if (mhs < 4) {
            System.out.println("Tidak Boleh Kurang Dari 4");
        } else {
            nilai = new int[mhs];
            for (int i = 0; i <= mhs - 1; i++) {
                System.out.print("Nilai Mahasiswa " + (i + 1) + " : ");
                nilai[i] = input.nextInt();
            }
            for (int j = 0; j <= mhs - 1; j++) {
                jumlah = jumlah + nilai[j];
            }
            rata = jumlah / mhs;
            ntt = nilai[0];
            ntr = nilai[0];
            for (int k = 0; k <= mhs - 1; k++) {
                if (ntt < nilai[k]) {
                    ntt = nilai[k];
                }
                if (ntr > nilai[k]) {
                    ntr = nilai[k];
                }
            }
            System.out.println("Daftar Nilai Algoritma Pemrograman");
            System.out.println("--------------------------");
            System.out.println("Nilai rata-rata kelas : " + rata);
            System.out.println("Nilai Tertiggi = " + ntt);
            System.out.println("Nilai Terendah = " + ntr);
        }
    }
}