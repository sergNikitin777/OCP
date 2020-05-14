package ethuware.stest3.test29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        Stream<String> lines = Files.find(Paths.get("test.txt"));
//        lines.forEach(System.out::println);

        BufferedReader bfr = new BufferedReader(new FileReader("test.txt"));
        while(bfr.ready()) {
            System.out.println(bfr.readLine());
        }

//        Stream<String> lines = Files.list(Paths.get("test.txt"));
//        lines.forEach(x->System.out.println(x));

        Stream<String> lines = Files.lines(Paths.get("test.txt"));
        lines.forEach(System.out::println);

        Stream<String> lines1 = Files.lines(Paths.get("test.txt"), Charset.defaultCharset());
        lines1.forEach(s -> System.out.println(s));
    }
}
