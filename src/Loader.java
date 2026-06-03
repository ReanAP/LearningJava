public class Loader {

    public static void main(String[] args) {

        Car[] cars = {new Car("Lamborgini", "Yellow"),
                new Car("Honda", "Red"),
                new Car("Suzuki", "Purple"),
                new Car("Toyota", "Magenta")};

        for(Car car : cars) {
            car.coloure = "Gray";
        }

        for(Car car : cars) {
            car.drive();
        }
    }
}
