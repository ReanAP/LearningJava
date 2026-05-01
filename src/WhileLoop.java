import java.util.Scanner;


public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

        do {
            System.out.print("Whats Your Name? ");
            name = scanner.nextLine();
        } while (name.isEmpty());
        System.out.println("\nYour Name Is " + name.substring(0, 1).toUpperCase() + name.substring(1));

        scanner.close();
    }
}
