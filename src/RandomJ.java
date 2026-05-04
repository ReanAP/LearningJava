import java.util.Random;
import java.util.Scanner;

public class RandomJ {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

//        System.out.println(random.nextInt(1,20));
        if(random.nextBoolean()) {
            System.out.print("Heads");
        }
        else {
            System.out.print("Tails");
        }

//        System.out.println(Math.PI);
//        System.out.print(Math.E);

//        System.out.print("Whats The Length Of The Right Angle Triangle: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("Whats The Breadth Of The Right Angle Triangle: ");
//        double b = scanner.nextDouble();
//
//        System.out.print("\nThe Hypotenuse Of The Right Angle Triangle Is: " + Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2))));

        scanner.close();
    }
}
