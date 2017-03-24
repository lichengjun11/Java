package java1702.javase.oop;

import java.util.Scanner;

/**
 * Created by lichengjun on 2017/3/16.
 */
public class Oop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出年份");
        int year = scanner.nextInt();
        if (((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year+"是一个闰年");
        } else {
            System.out.println(year+"不是一个闰年");
        }
    }
    }







//    public boolean isLeapYear(int year) {
//        if ((year % 400 == 0)||((year % 4 == 0)&&(year % 100 != 0))) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        Oop1 oop1 = new Oop1();
//        if (oop1.isLeapYear(2016)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//    }

