package ethuware.stest5.test16;

import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);

        int max = ls.stream().reduce((a, b)->a>b?a:b).get();
        int maxx = ls.stream().reduce(Integer.MIN_VALUE,(a, b)->a>b?a:b);
        System.out.println(max); //1
        System.out.println(maxx); //2
    }
}
