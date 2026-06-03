public class ENtry {

    public static void main(String[] args) {
        Person person = new Person("Tom", "Cruise");
        Student student = new Student("James", "Lord", 3.8);
        Employee employee = new Employee("Rakesh", "Khanna", 72000.761);

//        System.out.println(student.firstname + " " + student.lastname);
//        System.out.println(student.gpa);

//        student.ShowGpa();
        Employee.Info();
    }

}
