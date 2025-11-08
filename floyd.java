package patterns;

public class floyd {
    public static void main(String[] args) {
        int i, j, n = 5, num = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }
    }
}
