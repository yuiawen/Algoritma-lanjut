import java.util.Scanner;

public class PengurutanDataWithInput {
    public static void bubbleSort(int[] Data) {
        int n = Data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Data[j] > Data[j + 1]) {
                    // Proses pertukaran elemen Data[j] dan Data[j + 1]
                    int temp = Data[j];
                    Data[j] = Data[j + 1];
                    Data[j + 1] = temp;
                }
            }
        }
    }

    public static void printData(int[] Data) {
        for (int i = 0; i < Data.length; i++) {
            System.out.print(Data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();

        int[] Data = new int[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + " = ");
            Data[i] = scanner.nextInt();
        }

        System.out.println("Data sebelum diurutkan:");
        printData(Data);
        bubbleSort(Data);
        System.out.println("Data setelah diurutkan:");
        printData(Data);

        scanner.close();
    }
}
