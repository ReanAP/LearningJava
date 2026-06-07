package learningjava.oop;

public class overloaded_methods {

    public static void main(String[] args)
    {
        String pizza = bakepizza("Flat Bread", "Italian Cheese", "Sausage");
        System.out.println(pizza);

    }

    static String bakepizza(String bread)
    {
        return "This is a " + bread + " Pizza.";
    }

    static String bakepizza(String bread, String cheese)
    {
        return "This is a " + bread + " " + cheese + " Pizza.";
    }

    static String bakepizza(String bread, String cheese, String topping)
    {
        return "This is a " + bread + " " + cheese + " " + topping + " Pizza.";
    }
}
