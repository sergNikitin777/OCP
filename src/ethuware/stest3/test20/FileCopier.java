package ethuware.stest3.test20;

import java.io.*;

public class FileCopier {

    public static void copy(String records1, String records2) throws IOException {
        try (
                InputStream is = new FileInputStream(records1);
                OutputStream os = new FileOutputStream(records2);) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

        } catch (FileNotFoundException | java.io.InvalidClassException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        copy("test.txt", "test1.txt");
    }
}