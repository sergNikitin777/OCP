package ethuware.stest3.test31;

import java.util.concurrent.locks.ReentrantLock;

public class TestClass {
    public static void main(String[] args) {

        ReentrantLock rlock = new ReentrantLock();
        boolean f1 = rlock.tryLock();
        System.out.println(f1);
        boolean f2 = rlock.tryLock();
        System.out.println(f2);

    }
}
