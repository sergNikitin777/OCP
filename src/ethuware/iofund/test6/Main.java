package ethuware.iofund.test6;

import java.io.*;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        FileOutputStream fos = new FileOutputStream("test.txt");
        RandomAccessFile ras = new RandomAccessFile("test.txt", "rw");
        FileWriter fw = new FileWriter("test.txt");
        FileChannel f1  = fis.getChannel(); //1
        FileChannel f2  = fos.getChannel(); //2
        FileChannel f3  = ras.getChannel(); //3
        //FileChannel f4  = fw.getChannel(); //4
    }
}
