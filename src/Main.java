import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Whats Your Name? ");
//        String data = scanner.next();
//
//        System.out.print("Hey " + data + " nice to meet you!");

        Infos info = new Infos("Himanshu", 22.1, 1);
        Infos yinfo = new Infos("Rakesh", 710000.6);
        Infos linfo = new Infos("Ramesh", 2000098.00, 192.8);
//
        System.out.println(info.name + " " + info.age + " " + info.height+"cm");
        System.out.println(yinfo.name + " " + yinfo.salary+"Rs");
        System.out.print(linfo.name + " " + linfo.salary+"Rs" + " " + linfo.worktime+"hours");

//        System.out.print(callme("Himanshu"));


    }
//    static String callme(String name){
//        return "Iam Called Call ME " + name;
//    }
//    static String callme(String name, int age) {
//        return "Iam Called " + name + " " + age;
//    }
}