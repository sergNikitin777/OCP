package ethuware.stest5.test10;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
    public static void main(String[] args) {
        Path p1 = Paths.get("/photos/./rbs/../vacation");
        Path p2 = Paths.get("/yellowstone");
        System.out.println(p1.resolve(p2)+"  "+p1.relativize(p2));
    }
}
