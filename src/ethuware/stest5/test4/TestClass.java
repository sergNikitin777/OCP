package ethuware.stest5.test4;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestClass {
    public static void main(String[] args) {

        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d.pollFirst());
        System.out.println(d.poll());
        System.out.println(d.pollLast());

    }
}
