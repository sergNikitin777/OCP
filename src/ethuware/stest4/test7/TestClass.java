package ethuware.stest4.test7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17); //1
        Stream<Integer> primeStream = primes.stream(); //2

        Predicate<Integer> test1 = k->k<10; //3
        //long count1 = primeStream.filter(test1).count();//4
        primeStream.collect(Collectors.partitioningBy(test1, Collectors.counting()))
                .values().forEach(System.out::print);

        Predicate<Integer> test2 = k->k>10; //5
        //long count2 = primeStream.filter(test2).count(); //6

        //System.out.println(count1+" "+count2); //7
//        primeStream.collect(Collectors.partitioningBy(test1, Collectors.counting()))
//                .values().forEach(System.out::print);

        long count1 = primes.stream().filter(test1).count();//4

        long count2 = primes.stream().filter(test2).count();//6

        System.out.println(count1+" "+count2); //7
    }
}
