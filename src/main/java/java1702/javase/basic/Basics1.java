package java1702.javase.basic;

import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/4/1 11:03.
 */
public class Basics1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建扫描仪
        System.out.println("请输入变量A的值");
        int A = scanner.nextInt();
        System.out.println("请输入变量B的值");
        int B = scanner.nextInt();
        System.out.println("A =" +A +"\tB =" +B);
        System.out.println("执行变量互换");
        A = A^B;
        B = B ^A;
        A = A^ B;
        System.out.println("A = " +A +"\tB =" +B);
    }
}
