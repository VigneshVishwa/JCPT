
// You are using Java
import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("The entered month is in the Winter");
                break;
            case 10:
                System.out.print("The entered month is in the Winter");
                break;
            case 11:
                System.out.print("The entered month is in the Winter");
                break;
            case 12:
                System.out.print("The entered month is in the Winter");
                break;
            case 2:
                System.out.print("The entered month is in the Summer");
                break;
            case 3:
                System.out.print("The entered month is in the Summer");
                break;
            case 4:
                System.out.print("The entered month is in the Summer");
                break;
            case 5:
                System.out.print("The entered month is in the Summer");
                break;
            case 6:
                System.out.print("The entered month is in the Spring");
                break;
            case 7:
                System.out.print("The entered month is in the Spring");
                break;
            case 8:
                System.out.print("The entered month is in the Spring");
                break;
            case 9:
                System.out.print("The entered month is in the Spring");
                break;
            default:
                System.out.print("The entered month is in the Bogus Month");
                break;

        }
    }
}