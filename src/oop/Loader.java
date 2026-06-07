package learningjava.oop;

public class Loader {

    public static void main(String[] args) {

        Car[] cars = {new Car(),
                new Car(),
                new Car(),
                new Car()};

        for(Car car : cars) {
            car.coloure = "Gray";
        }

        for(Car car : cars) {
            car.drive();
        }
    }
}
