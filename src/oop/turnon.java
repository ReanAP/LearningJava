package learningjava.oop;

public class turnon {
    public static void main (String[] args) {
        carpenters tarun = new carpenters(22, 71000, "Carpenter");
        teachers rakesh = new teachers(32, 61000, "Teacher");
        plumber bakesh = new plumber(29, 66100, "Plumber");


        System.out.println(tarun.age + " " + tarun.profession);
        System.out.println(rakesh.age + " " + rakesh.profession);
        System.out.println(bakesh.age + " " + bakesh.purpose);
        bakesh.task();
    }
}
