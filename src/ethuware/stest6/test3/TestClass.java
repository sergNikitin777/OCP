package ethuware.stest6.test3;

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
        new TestClass().new A();
        new TestClass.B();
        new A();
        new TestClass.A();
    }
}