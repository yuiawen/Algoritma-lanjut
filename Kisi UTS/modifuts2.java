public class modifuts2 {
    public static void main(String arg[]) {
        int i = 0, j = 1, k = 1;
        while (i < 2) {
            while (j <= 2) {
                while (k <= j) {
                    if (k % 2 == 0)
                        System.out.println(k);
                    else
                        System.out.println(j);
                    k++;
                }
                j++;
                k = 1;
            }
            i++;
            j = 1;
        }
    }
}
