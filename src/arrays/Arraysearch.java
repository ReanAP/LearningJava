package learningjava.arrays;

public class Arraysearch {

    public static void main(String[] args) {
        int[] numlist = {6, 7, 0, 3, 5, 8, 2, 34, 789, 99, 9};

        int target = 99;
        boolean isFound = false;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] == target) {
                System.out.println("The Element is in Index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            System.out.println("The Element Was Not Found");
        }
    }
}
