package learningjava.oop;

public class CallingClass {

    public static void main(String[] args) {

        Car car = new Car();

        Student student1 = new Student("Henry", "21", 3.4);
        Student student2 = new Student("Thomas", "gen", 3.1);
        Student student3 = new Student("Alie", "22", 3.8);

        teachers teach1 = new teachers("Rajesh", "English", 5, true);
        teachers teach2 = new teachers("Rubika", "Physics", 8, false);
        teachers teach3 = new teachers("Ramesh", "Chemisty", 12, true);



//        System.out.println(teach1.name);
//        System.out.println(teach2.isEmployed);

//        System.out.println(car.isRunning);
//        car.start();
//        System.out.println(car.isRunning);
//        car.stop();
//        System.out.println(car.isRunning);
//        car.drive();

//        System.out.println(student1.name + " " + student1.age + " " + student1.gpa);
//        System.out.println(student2.name + " " + student2.age + " " + student2.gpa);
//          System.out.println(student3.isEnrolled);

//        student3.study();

//            teach2.intro();


    }
}
