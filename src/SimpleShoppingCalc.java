import java.util.Scanner;

public class SimpleShoppingCalc {
    public static void main(String[] args) {

        String itemName;
        double itemCOST;
        int totalITEMS;
        char currency = '$';

        Scanner scanner = new Scanner(System.in);

        System.out.print("What Item Would You Like To Buy: ");
        itemName = scanner.nextLine();
        System.out.print("What is The Price Of The Item: ");
        itemCOST = scanner.nextDouble();
        System.out.print("How Many " + itemName + " Would You Like To Purchase: ");
        totalITEMS = scanner.nextInt();

        System.out.println("\nYou Have Bought " + totalITEMS + " " + itemName + "'s");
        System.out.println("Your Total is: " + currency + totalITEMS*itemCOST);

        scanner.close();

    }

}
