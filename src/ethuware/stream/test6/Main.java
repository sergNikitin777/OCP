package ethuware.stream.test6;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("j", "a", "v","a");

        letters.forEach(letter->letter.toUpperCase());
        letters.forEach(System.out::print);

        /*
        UnaryOperator<String> uo = str->str.toUpperCase();
        letters.forEach(uo);
        letters.forEach(System.out::print);
         */

        UnaryOperator<String> uo = str->str.toUpperCase();
        letters.replaceAll(uo);
        letters.forEach(System.out::print);

        letters.forEach(letter->System.out.print(letter.toUpperCase()));

        System.out.print(letters.stream().collect(Collectors.joining()).toUpperCase());

        //System.out.print(letters.stream().collect(Collectors.joining(e->e);

    }
}
