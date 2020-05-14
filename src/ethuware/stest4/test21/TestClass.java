package ethuware.stest4.test21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {

        String sentence1 = "Carpe diem. Seize the day, boys. Make your lives extraordinary.";
        String sentence2 = "Frankly, my dear, I don't give a damn!";
        String sentence3 = "Do I look like I give a damn?";
        List<String> sentences = Arrays.asList(sentence1, sentence2, sentence3);

        Stream<String> strm = sentences.stream()
                .flatMap(str-> Stream.of(str.split("[ ,.!?\r\n]")))
                .filter(s->s.length()>0)
                .distinct();

        strm.forEach(System.out::println);

    }
}
