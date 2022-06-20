import java.util.Scanner;

class Vehicle {
    String str;

    public void move(String str) {
        System.out.println(str);
    }
}

class MotorBike extends Vehicle {
    String str;

    public void move(String str) {
        System.out.println(str);
    }
}

public class DynamicPolymorphism {

    public static void main(String[] args) {

        Vehicle vh = new MotorBike();
        Scanner sc = new Scanner(System.in);
        String t, t1;
        t = sc.nextLine();
        t1 = sc.nextLine();
        vh.move(t1);
        vh = new Vehicle();

        vh.move(t);

    }

}
