package ethuware.threads.test3;

public class RunTest {
    static class Runner implements Runnable{
        public void run(){
            System.out.println("In Run");
        }
    }

    public static void main(String[] args) {
        Runner r = new Runner();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }

}