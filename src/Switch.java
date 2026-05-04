import java.util.Scanner;

public class Switch {
    public static  void main(String[] args) {

        String dayraw;
        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What Day Is It Today?: ");
        dayraw = scanner.nextLine();
        day = dayraw.substring(0,1).toUpperCase() + dayraw.substring(1);

        switch(day){

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                    -> System.out.println("\nIt Is A WeekDay ");
            case "Saturday", "Sunday"
                    -> System.out.println("\nIt Is A WeekEnd");

            default -> System.out.println("\n" + day + " Is Not A Real Day!!");

        }

    }
}
