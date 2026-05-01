import java.util.Scanner;

public class Load {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = 0;

        System.out.print("Enter The length Of The Rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter The Width Of The Rectangle: ");
        double width = scanner.nextDouble();

        area = width * length;

        System.out.println("The Area Of The Rectangle Is: " + area);

        scanner.close();

    }
}
