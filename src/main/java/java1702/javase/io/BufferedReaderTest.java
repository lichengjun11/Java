package java1702.javase.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Li chengjun
 * on 2017/4/21 10:06.
 */
// 缓冲reader
public class BufferedReaderTest {
    private static final String FILE = "src/main/java1702/javase/io/BufferResderTest.java";
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE))){
            String line;
            while((line=bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
