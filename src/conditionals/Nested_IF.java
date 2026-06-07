package learningjava.conditionals;

public class Nested_IF {

    public static void main(String[] args) {

        boolean isStudent = false;
        int age = 10;
        boolean isSenior = true;
        double studentPrice = 9.99;
        double CitizenPrice = 13.99;

        if (isStudent) {
            if (age == 17) {
                System.out.print("\nThe Prize For The Ticket Is: " + studentPrice + "\n");
            }
        }
        else if (isSenior) {
            if (age != 17) {
                System.out.print("\nThe Prize For The Ticket Is: " + CitizenPrice + "\n");
            }
        }
        else {
            System.out.print("\nThe Prize For The Ticket Is: " + CitizenPrice + "\n");
        }
    }
}
