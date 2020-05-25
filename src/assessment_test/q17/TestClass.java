package assessment_test.q17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
B, C, E. Numerous lines would have to be corrected for the code to compile, so A, F, and G
are incorrect. First off, the second parameter to Files.find() is the depth limit and must
be an int, so line k1 would have to be changed to make the code compile, and B is correct.
Next, the Files.find() method uses a BiPredictate<Path,BasicFileAttribute>, not
a Predicate<Path>, for its lambda expression, so line k2 would also need to be changed to
allow the code to compile, and C is also correct. Finally, Files.readAllLines() returns
a List<String>, not a stream, so the following line, k4, which applies flatMap(), would
also prevent the code from compiling, and E is correct. D is incorrect, since line k3 by itself
does not cause any compilation issues.
 */

public class TestClass {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/gorilla/signed-words.txt");

        Files.find(path.getParent(),10, // k1
                (p,b)-> p.toString().endsWith(".txt") && b.isDirectory()) // k2
                .collect(Collectors.toList())
                .forEach(System.out::println);
        Files.readAllLines(path).stream() // k3
                .flatMap(p -> Stream.of(p.split(" "))) // k4
                .map(s -> s.toLowerCase()) // k5
                .forEach(System.out::println);


    }
}
