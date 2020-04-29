package ethuware.stest2.test24;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestClass {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.addFirst(2);
        d.pop();
        d.offerFirst(3);
        for(Integer i : d){
            System.out.println(i);
        }
    }
}
