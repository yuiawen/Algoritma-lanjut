
public class PengurutanData {
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
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] Data = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Data sebelum diurutkan:");
        printData(Data);
        bubbleSort(Data);
        System.out.println("Data setelah diurutkan:");
        printData(Data);
    }

}