package ethuware.stest2.test26;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        Stream<Integer> stream = Stream.of(11, 11, 22, 33).parallel();
        List<Integer> list = stream.filter(e->{
            ai.incrementAndGet();
            return e%2==0;
        }).collect(Collectors.toList());
        System.out.println(ai);
        System.out.println(list);
    }
}
