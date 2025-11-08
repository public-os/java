package patterns;

public class ihp_with_num {
    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 0; i < n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
