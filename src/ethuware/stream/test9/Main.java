package ethuware.stream.test9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);
        //double sum = ls.stream().reduce(0, (a, b)->a+b);
        double sum = ls.stream().mapToInt(x->x).sum();


        System.out.println(sum);
    }
}
