import java.util.*;

public class SizeOfCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Size of the collection " + list.size());
        int n = list.size();
        System.out.println("Is the arrayList empty: " + (n > 0 ? false : true));
    }
}