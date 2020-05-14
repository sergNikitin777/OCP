package ethuware.stest5.test14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream is1 = IntStream.range(1, 3);
        IntStream is2 = IntStream.rangeClosed(1, 3);
        IntStream is3 = IntStream.concat(is1, is2);
        Map<Integer, List<Integer>> listMap = is3.boxed().collect(Collectors.groupingBy(k->k));
        System.out.println(listMap);
        Object val = listMap.get(3);
        System.out.println(val);
    }
}
