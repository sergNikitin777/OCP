package assessment_test.q7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by snikitin on 28.10.19.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("/home/snikitin/workspace/ocp/src/","../").resolve(Paths.get(
                "./README.md")).normalize();
        Path path2 = new File("../ocp/README.md").toPath().toRealPath();
        System.out.print(Files.isSameFile(path1,path2));
        System.out.print(" "+path1.equals(path2));

    }
}

/*
A. true true
B. false false
C. true false
D. false true
E. The code does not compile.
F. The code compiles but throws an exception at runtime.
 */