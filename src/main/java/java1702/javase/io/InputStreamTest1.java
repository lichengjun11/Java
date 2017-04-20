package java1702.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Li chengjun
 * on 2017/4/20 21:45.
 */
public class InputStreamTest1 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("new");){
            int i;
            while((i = inputStream.read())!= -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
