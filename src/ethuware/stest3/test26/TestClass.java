package ethuware.stest3.test26;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
    public static void main(String[] args) {
        Path p1 = Paths.get("/a/b/c.java");
        System.out.println(p1.getName(2).toString());
    }
}
