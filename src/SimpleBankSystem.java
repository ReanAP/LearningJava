import java.util.Scanner;

public class SimpleBankSystem {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0.0;

    public static void main(String[] args) {

        double opt;

        do {
            opt = start();
            if (opt == 1){
                deposit();
            }
            else if (opt == 2) {
                withdraw();
            }
            else if (opt == 3) {
                checkbal();
            }
            else if (opt == 4) {
                exit();
            }
        } while (opt != 4);
    }

    static int start() {

        System.out.println("Welcome To Our Banking System!");
        System.out.println("");
        System.out.println("1: Deposit Money");
        System.out.println("2: Withdraw Money");
        System.out.println("3: Check Balance");
        System.out.println("4: Exit");
        System.out.println("");

        System.out.print("Use The Numbers To Select The Task That You Would Like To Perform: ");

        int option = scanner.nextInt();

        return option;
    }

    static void deposit() {
        System.out.print("");
        System.out.print("How Much Money Would You Like To Deposit: ");
        double deposit = scanner.nextDouble();
        System.out.print("");

        balance = balance + deposit;

        System.out.print("");
        System.out.print("You Have Successfully Deposited " + deposit + " Amount Your Current Balance Is " + balance + "\n");
        System.out.print("");

    }

    static void withdraw() {
        System.out.print("");
        System.out.println("How Much Money Would You Like To Withdraw: ");
        double withdraw = scanner.nextDouble();
        System.out.print("");

        balance = balance - withdraw;

        System.out.print("");
        System.out.println("You Have Successfully Withdrawn " + withdraw + " Amount Your Current Balance Is " + balance + "\n");


    }

    static void checkbal() {
        System.out.print("");
        System.out.println("Your Current Balance Is " + balance + "\n");
        System.out.print("");


    }

    static void exit() {
        System.out.println("You Have Successfully Exited The Program");
        System.exit(0);

    }

}
