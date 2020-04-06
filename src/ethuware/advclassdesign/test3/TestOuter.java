package ethuware.advclassdesign.test3;

public class TestOuter
{
    public void myOuterMethod()
    {
        // 1
        new TestInner();
    }
    public class TestInner { }
    public static void main(String[] args)
    {
        TestOuter to = new TestOuter();
        // 2
        new TestOuter().new TestInner();
    }
}

