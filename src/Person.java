public class Person {
    static String firstname;
    String lastname;

    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    void ShowNames() {
        System.out.println("Your Name is " + this.firstname + " " + this.lastname);
    }
}
