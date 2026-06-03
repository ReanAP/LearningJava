public class Car {

    String modele;
    String coloure;

    Car(String model, String colour) {
        this.modele = model;
        this.coloure = colour;
    }

    void drive() {
        System.out.println("You Drive "+ coloure + " " + modele);
    }
}
