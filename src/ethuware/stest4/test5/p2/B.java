package ethuware.stest4.test5.p2;

import ethuware.stest4.test5.p1.*;

public class B extends ethuware.stest4.test5.p1.A
{
    public void process(A a)
    {
        // a.i = a.i*2; //not compile i is protected
    }
    public static void main(String[] args)
    {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println( a.getI() );
    }
}
