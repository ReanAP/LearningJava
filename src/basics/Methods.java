package learningjava.basics;

import java.util.Scanner;

public class Methods {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Write The Number You Would Like To Square: ");
//        double num = scanner.nextInt();
//
//        System.out.println("\n" + square(num));
//    }
//
//    static String square(double num){
//        return "The Square Of " + num + " is " + num*num;
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your First Name: ");
        String fname = scanner.nextLine();
        System.out.print("Enter Your Last Name: ");
        String lname = scanner.nextLine();

        System.out.print(fullname(fname, lname));
    }
    static String fullname(String fname,String lname) {
        return "Your Full Name Is: " + fname.substring(0, 1).toUpperCase() + fname.substring(1) + " " + lname.substring(0, 1).toUpperCase() + lname.substring(1);
    }
}
