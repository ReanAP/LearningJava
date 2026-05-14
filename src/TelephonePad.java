public class TelephonePad {

    public static void main(String[] args) {

        char[][] numpad = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};

        for (char[] num : numpad) {
            for (char i : num) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
