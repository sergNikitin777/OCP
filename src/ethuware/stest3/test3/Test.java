package ethuware.stest3.test3;

import java.io.*;
public class Test
{
    public static void main(String[] args)  throws Exception
    {
        FileWriter fw = new FileWriter("text.txt");
        fw.write("hello"); //1
        fw.close();
    }
}
