package ethuware.nio.test1;

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/code/java/PathTest.java");
        System.out.println(p1.getName(3).toString());
    }
}
