package ethuware.stest2.test33;

class A
{
    public void getItDone(int counter)
    {
        assert counter >= 0 : "Less than zero";
        for(int i=0; i<counter; i++){ }
    }
}
class B extends A
{
    public void getItDone(int counter)
    {
        assert counter < 100 : "Greater than 100";
        for(int i=counter; i>0; i--){ }
    }
    public static void main(String args[])
    {
        A a = new B();
        a.getItDone(-4);
    }
}
