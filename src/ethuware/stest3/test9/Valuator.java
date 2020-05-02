package ethuware.stest3.test9;

import java.util.concurrent.atomic.AtomicInteger;

public  class Valuator {
    public AtomicInteger status = new AtomicInteger(0);
    public void valuate() {
        int oldstatus = status.get();
        /* valid code here */
        int newstatus = 3;//determine new status

        //INSERT CODE HERE
        status.compareAndSet(oldstatus, newstatus);

        System.out.println(status.get());

    }

    public static void main(String[] args) {
        Valuator v = new Valuator();
        v.valuate();
    }
}
