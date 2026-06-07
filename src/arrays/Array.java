package learningjava.arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        //var that can store more than one value.
        String[] fruits = {"apple", "banana", "pineapple", "peach"};

        int len = fruits.length;

        Arrays.sort(fruits);

//        System.out.println(len);
//       for (int i = 0; i<len; i++) {
//           System.out.println(fruits[i]);
//       }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
