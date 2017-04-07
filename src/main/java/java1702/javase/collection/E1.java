package java1702.javase.collection;

import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/4/1 13:45.
 */
public class E1 {
    public static void main(String[] args) {
   int[][] ints = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println("input int:");
                ints[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += ints[i][j];
                }
                if (i + j == ints.length -1) {
                    mul *= ints [i][j];
                }


            }
        }

    }
}
