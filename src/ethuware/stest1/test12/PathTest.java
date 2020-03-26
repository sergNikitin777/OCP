package ethuware.stest1.test12;

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Users/a17818450/IdeaProjects/OCP/src/ethuware/test12/PathTest.java");
        System.out.println(p1.getName(1).toString());
    }
}