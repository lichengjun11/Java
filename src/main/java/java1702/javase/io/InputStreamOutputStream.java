package java1702.javase.io;

import java.io.*;

/**
 * Created by Li chengjun
 * on 2017/4/20 11:37.
 */
public class InputStreamOutputStream {
    private static final String PATH = "src/main/java/java1702/javase/io/";

    public static void main(String[] args) {
        try (
            InputStream inputStream = new FileInputStream(PATH.concat("InputStreamOutputStream.java"));
            OutputStream outputStream = new FileOutputStream("Test1.java")
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
