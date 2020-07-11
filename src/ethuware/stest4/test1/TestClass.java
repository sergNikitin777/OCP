package ethuware.stest4.test1;

import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);

        //double sum = ls.stream().sum();

        double sum = ls.stream().reduce(0, (a, b)->a+b);

        System.out.println(sum);

        sum = ls.stream().mapToInt(x->x).sum();

        System.out.println(sum);

        //double sum = 0;
        //ls.stream().forEach(a->{ sum=sum+a; });

        //ls.stream().peek(x->{sum=sum+x;}).forEach(y->{});

    }
}
