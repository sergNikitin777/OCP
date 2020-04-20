package ethuware.concurrency.test4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class ItemProcessor extends Thread{  //LINE 1
    CyclicBarrier cb;
    public ItemProcessor(CyclicBarrier cb){
        this.cb = cb;
    }
    public void run(){
        System.out.println("processed");
        try {
            cb.await();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

 class Merger implements Runnable{ //LINE 2
    public void run(){
        System.out.println("Value Merged");
    }
}


public class TestClass {
    public static void main(String[] args) throws Exception {
        Merger m = new Merger();

        CyclicBarrier cb = new CyclicBarrier(2, m);  //LINE 3

        ItemProcessor ip = new ItemProcessor(cb);
        ip.start(); //LINE 4
        cb.await();
    }
}
