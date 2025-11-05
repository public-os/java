import java.util.*;

public class Str_IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String name = sc.nextLine();
        System.out.println("You entered : " + name);

        sc.close();
    }
}
