package learningjava.oop;


public class Core {

    public static void main(String[] args) {

        Friend friend1 = new Friend("SpongBOB");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("SquidWard");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Gary");


//        System.out.print("You Have " + Friend.numOfFriends + " Total Friends.");
        Friend.ShowFriends();
    }

}
