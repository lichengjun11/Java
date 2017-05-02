package java1702.javase.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Li chengjun
 * on 2017/4/27 10:19.
 */
public class E4 {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("a.txt","rw")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;{

        }
    }
}
