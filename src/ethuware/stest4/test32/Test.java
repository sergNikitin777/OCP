package ethuware.stest4.test32;

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

