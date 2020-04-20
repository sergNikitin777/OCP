package ethuware.lambda.test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);

        int max = ls.stream().max(Comparator.comparing(a -> a)).get();
        System.out.println(max); //1

        Optional<Integer> maxOpt = ls.stream().reduce((a, b) -> a > b ? a : b);

        if (maxOpt.isPresent())
            System.out.println(maxOpt.get()); //2
    }
}
