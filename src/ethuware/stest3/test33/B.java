package ethuware.stest3.test33;

class A
{
    A() {  print();   }
    protected void print() { System.out.println("A"); }
}
public class B extends A
{
    int i =   Math.round(3.5f);
    public static void main(String[] args)
    {
        A a = new B();
        a.print();
    }
    @Override
    public void print() { System.out.println(i); }
}
