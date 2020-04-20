package ethuware.threads.test4;

public class Test extends Thread
{
    static int x, y;
    public synchronized void run(){  for(;;){ x++; y++; System.out.println(x+" "+y);} }
    public static void main(String[] args)
    {
        new Test().start();
        new Test().start();
    }
}