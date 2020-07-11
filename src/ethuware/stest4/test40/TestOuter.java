package ethuware.stest4.test40;

public class TestOuter
{
    public void myOuterMethod()
    {
        new TestOuter().new TestInner(); //1
        new TestInner();
    }
    public class TestInner { }
    public static void main(String[] args)
    {
        TestOuter to = new TestOuter();

    }
}