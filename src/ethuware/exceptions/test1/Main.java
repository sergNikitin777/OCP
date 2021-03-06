package ethuware.exceptions.test1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

    }

    public static void copy(String records1, String records2) {
        try (
                InputStream is = new FileInputStream(records1);
                OutputStream os = new FileOutputStream(records2);) {

            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }

    }
}
