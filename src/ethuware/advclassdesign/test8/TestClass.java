package ethuware.advclassdesign.test8;

public class TestClass
{
    public class A
    {
    }
    public static class B
    {
    }
    public void useClasses()
    {
        //1
        new TestClass().new A();
        new TestClass.B();
        new A();
        new TestClass.A();
    }
}