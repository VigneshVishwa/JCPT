import java.util.*;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(x + " found at location " + (i + 1));
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(x + " is not found");
        }
    }
}