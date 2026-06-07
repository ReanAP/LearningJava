package learningjava.oop;

public class Car {

    String modele;
    String coloure;

    Car() {
//        this.modele = model;
//        this.coloure = colour;
    }

    void drive() {
        System.out.println("You Drive "+ coloure + " " + modele);
    }
}
