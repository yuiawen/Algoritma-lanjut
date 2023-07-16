public class Kuis2_6Juni2023 {
    public int Tambah(int a, int b) {
        return a + b;
    }

    public double Tambah(double a, double b) {
        return a + b;
    }

    public String Tambah(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Kuis2_6Juni2023 calculator = new Kuis2_6Juni2023();
        int jumlah1 = calculator.Tambah(5, 10);
        System.out.println("Hasil penjumlahan int: " + jumlah1);
        double jumlah2 = calculator.Tambah(3.14, 2.5);
        System.out.println("Hasil penjumlahan double: " + jumlah2);
        String jumlah3 = calculator.Tambah("UTDI", " Bisa");
        System.out.println("Hasil penjumlahan string: " + jumlah3);
    }
}
