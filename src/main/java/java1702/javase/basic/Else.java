package java1702.javase.basic;

import java.util.Scanner;

/**
 * Created by lichengjun on 2017/3/10.
 */
public class Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D:");
        String d = scanner.nextLine();
        System.out.println(d);


        int i = 90;
        switch (i) {
            case 0:
                System.out.println("i = 1230 ...");
                break;
            case 3:
                System.out.println("i = 1...");
                break;
            default:
                System.out.println("default.123.");
        }
    }

    }
