package ethuware.stest3.test12;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        Path p1 = Paths.get(new URI("file://e:/temp/records"));
    }
}
