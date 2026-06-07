package learningjava.oop;

public class Infos {

    String name;
    int age;
    double height;
    double salary;
    double worktime;


    Infos(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = 0;
    }
    Infos(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    Infos(String name, double salary, double worktime) {
        this.name = name;
        this.salary = salary;
        this.worktime = worktime;
    }
}
