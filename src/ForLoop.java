import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        int i;
        int max;
        Scanner scanner = new Scanner(System.in);

        System.out.print("How Many Times Do You Want To Run The Loop? ");
        max = scanner.nextInt();

        for (i = 1; i <= max ;i++) {

            if(i == 5) {
                continue;
            }

            System.out.println("NUM: " + i);
        }
    }
}
