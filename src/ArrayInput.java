import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How Long Do You Want The Foodlist To Be? ");
        int len = scanner.nextInt();
        String clear  = scanner.nextLine();

        String[] list = new String[len];

        for(int i = 0; i < len; i++) {
            System.out.print("\nWhat Food Do You Like? ");
            String food = scanner.nextLine();
            list[i] = food;
               }
        System.out.println();
        for(String food : list) {
            System.out.println(food);
           }
        scanner.close();
        }
    }