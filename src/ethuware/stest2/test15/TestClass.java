package ethuware.stest2.test15;

class MyRunnable implements Runnable
{
    MyRunnable(String name)
    {
        new Thread(this, name).start();
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println("test");
    }
}
public class TestClass
{
    public static void main(String[] args)
    {
        Thread.currentThread().setName("MainThread");
        MyRunnable mr = new MyRunnable("MyRunnable");
        mr.run();
    }
}