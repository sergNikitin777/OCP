package ethuware.stest4.test27;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class TestClass extends Thread
{
    //private static volatile int threadcounter = 0;
    private static AtomicInteger threadcounter = new AtomicInteger();
    //private static  int threadcounter = 0;
    public void run()
    {
        addCouter();
    }

    private void addCouter() {
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadcounter.incrementAndGet());
    }

    public static void main(String[] args) throws Exception
    {
        //TestClass.threadcounter.incrementAndGet();
        for(int i=0; i<1000; i++)
        {
            //synchronized(TestClass.class)
            //{
                new TestClass().start();
            //}
        }
    }
}