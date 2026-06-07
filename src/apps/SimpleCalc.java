package learningjava.apps;

import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome To Our Simple Calculator! \n");
        System.out.print("What Task Would You Like To Perform? (sum/sub/divide): ");
        String opt = scanner.nextLine();

        if (opt.equals("sum")) {
            System.out.print("Enter First Num: ");
            num1 = scanner.nextInt();
            System.out.print("Enter Second Num: ");
            num2 = scanner.nextInt();

            System.out.println("");
            System.out.print((num1 + num2));

        } else if (opt.equals("sub")) {
            System.out.print("Enter First Num: ");
            num1 = scanner.nextInt();
            System.out.print("Enter Second Num: ");
            num2 = scanner.nextInt();

            System.out.println("");
            System.out.print((num1 - num2));

        } else if (opt.equals("divide")) {
            System.out.print("Enter First Num: ");
            num1 = scanner.nextInt();
            System.out.print("Enter Second Num: ");
            num2 = scanner.nextInt();

            if(num2 == 0) {
                System.out.println("");
                System.out.println("NaN");
            } else {
                System.out.println("");
                System.out.print((num1 / num2));
            }

        } else {
            System.out.print("Your Selected Option Doesn't Exist!");
        }
    }
}
