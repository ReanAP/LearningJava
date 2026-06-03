public class Start {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plants plants = new Plants();
        Lily lily = new Lily();
        Tulip tulip = new Tulip();

        System.out.println(tulip.isAlive);
        lily.photosynthesize();
        tulip.name();
        lily.name();
    }
}
