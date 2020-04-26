package ethuware.stest2.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class TestClass {
    public static void main(String[] args) throws Exception  {
        try(FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis)){
            while(isr.ready()){
                isr.skip(1);
                int i = isr.read();
                char c = (char) i;
                System.out.print(c);
            }
        }
    }
}
