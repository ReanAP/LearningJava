package learningjava.oop;

public class Friend {

    String name;
    static int numOfFriends;

    Friend(String naam) {
        this.name = naam;
        numOfFriends++;
    }

    static void ShowFriends() {
        System.out.print("YOu Have " + numOfFriends + " Total Friends");
    }
}
