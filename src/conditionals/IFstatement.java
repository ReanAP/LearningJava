package learningjava.conditionals;

import java.util.Scanner;

public class IFstatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        while (name.isEmpty()) {
            System.out.print("Enter Your Name: ");
            name = scanner.nextLine();

        }

        System.out.print("What Is Your Age?: ");
        age = scanner.nextInt();

        System.out.println("\nYour Name is " + name);

        if (age > 65) {
            System.out.println("\nYou Are A Senior");
        } else if (age >= 18) {
            System.out.println("\nYou Are An Adult!");
        } else if (age <= 0) {
            System.out.println("\nYou Have Not Been Born Yet!");
        } else if (age < 18 & age > 12) {
            System.out.println("\nYou Are a Teenager");
        } else {
            System.out.println("\nYou Are A Child");
        }

        scanner.close();
    }
}
