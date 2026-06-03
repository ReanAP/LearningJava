public class Employee extends Person{
    static double Salary;

    Employee(String firstname, String lastname, double Salary){
        super(firstname, lastname);
        this.Salary = Salary;
    }
      static void Info() {
        System.out.println(firstname + " Earns " + Salary);
    }
}
