package java1702.javase.exercise;

import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/3/30 9:04.
 */

// 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E7 {
    public static void main(String[] args) {
        //首先 接收用户从控制台输入的一行字符
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string:");
        String string = scanner.nextLine();//定义一个字符串类的变量string，独取一行。。可以获取用户从控制台输入的字符
        System.out.println(string);

    }
}