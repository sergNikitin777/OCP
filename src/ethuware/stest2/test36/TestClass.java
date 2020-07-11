package ethuware.stest2.test36;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
    public static void main(String[] args) {
        Path p1 = Paths.get("/temp/test.txt");
        Path p2 = Paths.get("/temp/report.pdf");
        System.out.println(p1.resolve(p2));
    }
}
