package ethuware.iofund.test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void processLines(String fullFilePath) throws Exception
    {
        // declare and initialize "handle" here
        //BufferedReader handle = new BufferedReader(new FileReader(fullFilePath));
        BufferedReader handle = new BufferedReader(new FileReader( new File(fullFilePath)));

        String str = null;
        while( (str = handle.readLine()) != null)
        {
            System.out.println("Processing line : "+str);
        }
        handle.close();
    }

    public static void main(String[] args) throws Exception {
        processLines("test.txt");
    }
}
