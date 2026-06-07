package learningjava.basics;

public class VarScope
{

    static int x = 77;

    public static void main(String[] args)
    {

//        int x = 21;

        System.out.println(x);

        func();
    }

    static void func()
    {

        int x = 9;

        System.out.println(x);
    }
}
