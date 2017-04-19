package java1702.javase.exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/4/18 9:12.
 */
// 受检异常

// 抽取方法快捷键  ctrl + alt + m
public class CheckedExceptionTest {
    public static void main(String[] args) {
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(filename,"r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("test..");
    }
}
