public class TwoDArray {

    public static void main(String[] args ) {

        String[] veggies = {"celery", "tomato", "spinach", "cabbage"};
        String[] fruits = {"apple", "banana", "orange", "peach", "pineapple"};
        String[] meats = {"pork", "chicken", "beef", "fish"};

        String[][] items = {veggies, fruits, meats};

        items[0][3] = "peas";

        for(String[] food : items ) {
            for(String names : food) {
                System.out.print(names + " ");
            }
            System.out.println("");
        }

    }



}
