import java.util.Scanner;

public class pangkatRecursive {
    public static int pangkat(int basis, int eksponen) {
        if (eksponen == 0) {
            return 1;
        } else {
            return basis * pangkat(basis, eksponen - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int basis = input.nextInt();

        System.out.print("Masukkan pangkat: ");
        int eksponen = input.nextInt();

        int hasil = pangkat(basis, eksponen);
        System.out.println(basis + " pangkat " + eksponen + " = " + hasil);

        input.close();
    }
}
