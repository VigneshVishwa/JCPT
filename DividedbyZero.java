import java.util.*;

public class DividedbyZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.print(a / b);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}