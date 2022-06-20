import java.util.*;

public class RemoveSpecificCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.next();
        String newstr = str;
        int n1 = str1.length();
        for (int i = 0; i < n1; i++) {
            str = str.replace(str1.charAt(i), 'x');
        }
        System.out.println(newstr);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x')
                continue;
            else
                System.out.print(str.charAt(i));
        }
    }
}