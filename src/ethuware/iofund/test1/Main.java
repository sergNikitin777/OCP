package ethuware.iofund.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write("hello");  //1
        bfw.newLine();  //2
        bfw.write("world");  //3
        //bfw.flush();
        bfw.close();
    }
}
