package ethuware.stest5.test26;

public class Counter
{
    public int startHere = 1;
    public int endHere = 100;
    public static void main(String[] args)
    {
        new Counter().go();
    }
    void go()
    {
        // A
//        Thread a = new Thread()
//        {
//            public void run()
//            {
//                for (int i = startHere; i <= endHere; i++){ System.out.println(i); }
//            }
//        };

        Runnable a = new Runnable()
        {
            public void run()
            {
                for (int i = startHere; i <= endHere; i++){ System.out.println(i); }
            }
        };

        Thread t = new Thread(a);
        t.start();
    }
}
