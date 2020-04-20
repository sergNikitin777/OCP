package ethuware.threads.test7;

public class MyThread extends Thread
{
    String msg = "default";
    public MyThread(String s)
    {
        msg = s;
    }
    public void run()
    {
        System.out.println(msg);
    }
    public static void main(String args[])
    {
        new MyThread("String1").run();
        new MyThread("String2").run();
        System.out.println("end");

        new MyThread("String1").start();
        new MyThread("String2").start();
        System.out.println("end");
    }
}
