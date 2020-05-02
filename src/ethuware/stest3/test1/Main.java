package ethuware.stest3.test1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path p1 = Paths.get("/temp/test.txt");
        Path p2 = Paths.get("/temp/report.pdf");
        System.out.println(p1.resolve(p2));
    }
}
