package ethuware.stest2.test7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.offerLast(2);
        d.push(3);
        d.peekFirst();
        d.removeLast();
        d.pop();
        System.out.println(d);
    }
}
