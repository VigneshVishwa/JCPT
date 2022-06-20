public class BasicTryCatch {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2 };
        int n = 0;
        try {
            // System
            n = arr[3];
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}