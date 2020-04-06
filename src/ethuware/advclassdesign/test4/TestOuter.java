package ethuware.advclassdesign.test4;

public class TestOuter
{
    public static class TestInner
    {
    }

    public static void main(String[] args) {
        new TestOuter.TestInner();
    }
}