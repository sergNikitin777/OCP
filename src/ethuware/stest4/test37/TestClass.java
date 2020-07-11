package ethuware.stest4.test37;

public class TestClass extends Thread
{
    private static int threadcounter = 0;
    public void run()
    {
        threadcounter++;
        System.out.println(threadcounter);
    }
    public static void main(String[] args) throws Exception
    {
        for(int i=0; i<10; i++)
        {
            synchronized(TestClass.class)
            {
                new TestClass().start();
            }
        }
    }
}