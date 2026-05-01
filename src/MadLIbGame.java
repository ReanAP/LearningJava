import java.util.Scanner;

public class MadLIbGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.print("Enter A Ajective (describe): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter A Noun (Animal): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter A Ajective2 (Place): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter A Verb (Doing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter A Ajective3 (Emotion): ");
        adjective3 = scanner.nextLine();

        System.out.println("");
        System.out.println("Today I Went To A " + adjective1 + " Zoo.");
        System.out.println("In A Exibit, I saw A " + noun1 + ".");
        System.out.println(noun1 + " Was "  + adjective2 + " and " + verb1 + "!");
        System.out.println("I was "+ adjective3  + " !");

        scanner.close();
    }
}
