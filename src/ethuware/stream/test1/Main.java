package ethuware.stream.test1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<List<String>> s1 = Stream.of(
                Arrays.asList("a", "b"),
                Arrays.asList("a", "c")
        );

        Stream<String> news = s1.filter(s->s.contains("c"))
                .flatMap(olds -> olds.stream());
        news.forEach(System.out::print);
    }
}
