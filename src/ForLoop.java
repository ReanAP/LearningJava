import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        int i;
        int j;
        int column;
        int rows;
        Scanner scanner = new Scanner(System.in);

        System.out.print("How Many Times Do You Want To Run The Loop? ");
        column = scanner.nextInt();
        System.out.print("How Long Do Want The Matric To Be? ");
        rows = scanner.nextInt();
        System.out.println();

        for (i = 1; i <= rows; i++ ) {
            for (j = 1; j <= column ;j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
