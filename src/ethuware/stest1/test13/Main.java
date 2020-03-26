package ethuware.stest1.test13;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    static class MyThread extends Thread
    {
        int i = 0;
        public void run()
        {
            while(true)
            {
                if( i%2 == 0 ) System.out.println("Hello World");
            }
        }
    }
}
