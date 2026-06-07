package learningjava.arrays;

public class varArray {

    public static void main(String[] args) {

       System.out.println(sum(1,2,3,5,6,2,5,6));

    }

    static int sum(int... num){
        int sum = 0;
        for (int i : num) {
            sum = sum+i;
        }
        return sum;
    }
}
