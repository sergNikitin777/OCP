package ethuware.stest5.test8;

public class StaticTest
{
    static
    {
        System.out.println("In static");
    }
    {
        System.out.println("In non - static");
    }
    public static void main(String args[ ])
    {
        StaticTest st1;                    //1
        System.out.println(" 1 ");
        st1 = new StaticTest();            //2
        System.out.println(" 2 ");
        StaticTest st2 = new StaticTest(); //3
    }
}
