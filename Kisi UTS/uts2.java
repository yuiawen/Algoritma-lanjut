public class uts2 {
    public static void main(String arg[]) {
        int i, j, k;
        i = 0;
        while (i < 2) {
            j = 1;
            while (j <= 2) {
                k = 1;
                while (k <= j) {
                    if (k % 2 == 0)
                        System.out.println(k);
                    else
                        System.out.println(j);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}
