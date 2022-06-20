import java.util.*;
import java.text.*;

public class DecimalFormating {
    static void printCurrency(Locale locale, double x) {
        NumberFormat form = NumberFormat.getCurrencyInstance(locale);
        String curr = form.format(x);
        System.out.println("Formatted in dollars " + curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println("Without fraction part " + Math.round(n));
        System.out.printf("Formatted to give precision %.2f", (float) n);
        System.out.println();
        System.out.println("Appended zeroes to right " + String.format("%.6f", n));
        DecimalFormat df = new DecimalFormat("00000.##");
        System.out.println("Formatting numeric part " + df.format(n));
        printCurrency(Locale.US, n);
    }
}