package ethuware.stest5.test27;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestClass {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10, 47, 33, 23);

        int max = ls.stream().max(Comparator.comparing(a->a)).get();

        Optional<Integer> om = ls.stream().reduce((a, b)->a>b?a:b);

        Optional<Integer> omax = ls.stream().map(a->a).max(Comparator.comparing(a->a));

    }
}
