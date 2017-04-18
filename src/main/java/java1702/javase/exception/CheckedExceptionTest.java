package java1702.javase.exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/4/18 9:12.
 */

// 抽取方法快捷键  ctrl + alt + m
public class CheckedExceptionTest {
    public static void main(String[] args) {
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            test(fileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test(String fileName) throws FileNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"r");
    }
}
