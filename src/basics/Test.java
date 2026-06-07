package learningjava.basics;

public class Test {

    public static void main(String[] args) {
        int num = 20;

        String check = (num>=60) ? "PASS" : "FAIL";

        System.out.println("\n" + check);

        switch (num) {
            case 30,20,10,50,60 -> System.out.println("\nNot 40");
            case 40 -> System.out.println("\nIs 40");
        }
    }
}
