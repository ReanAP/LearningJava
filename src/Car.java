public class Car {

    String brand = "Ford";
    String model = "Mustang";
    int year = 2024;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Car is Running Now!");
    }
    void stop() {
        isRunning = false;
        System.out.println("Car has Stopped!");
    }
    void drive() {
        System.out.println("You Are Driving A " + brand + " " + model);
    }
}
