package java1702.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Li chengjun
 * on 2017/4/18 10:37.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
//            InputStream inputStream = new FileInputStream("E:/test.txt");// 绝对路径
            InputStream inputStream = new FileInputStream("test1");// 相对路径
            int i;
            while ((i = inputStream.read()) != -1) {
            System.out.print((char)i);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
