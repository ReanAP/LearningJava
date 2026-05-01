import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats Your Weight?: ");
        double weight = scanner.nextDouble();
        System.out.print("In Which Metric (kg/lbs) ?: ");
        String metric = scanner.next();

        if (metric.contains("kg")) {
            System.out.printf("\nYour Weight In Lbs is: %.2f", weight*2.205);
        }
        else if (metric.contains("lbs")) {
            System.out.printf("\nYour Weight In Kgs is: %.2f", weight/2.205);
        }
        else {
            System.out.println("\nThat's Not A Valid Metric System");
        }
    }
}
