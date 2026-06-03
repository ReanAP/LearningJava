public class Student extends Person{

    double gpa;

    Student(String firstname, String lastname, double gpa) {
        super(firstname, lastname);
        this.gpa = gpa;
    }
    void ShowGpa() {
        System.out.println(this.firstname + " GPA is " + this.gpa );
    }
}
