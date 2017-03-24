package java1702.javase.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/3/21 16:43.
 */
public class EE1 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y < x) {
            System.out.println("小了");
        } else if( y > x) {
            System.out.println("大了");
        }
    }
}
