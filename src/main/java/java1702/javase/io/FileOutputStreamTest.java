package java1702.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Li chengjun
 * on 2017/4/19 9:04.
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try{
            // 创建字节输入流
            FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 创建字节输出流
        try {
            FileOutputStream fos = new FileOutputStream("newFile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] bbuf = new byte[32];
        int hasRead = 0;
        Readable fis;

    }

}
