public class VarScope
{

    int x = 77;

    public static void main(String[] args)
    {

        int x = 21;

        System.out.print(x);
    }

    static void func()
    {

        int x = 9;

        System.out.print(x);
    }
}
