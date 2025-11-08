package patterns;

public class inverted_HP {
    public static void main(String[] args) {
        int i, j, n = 4;
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
