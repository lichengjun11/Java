package java1702.javase.collection;

import java.util.Arrays;
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
      int k = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                k++;
                System.out.println("input int:"+k);
                ints[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += ints[i][j];      //1  2   5
                }
                if (i + j == 1){             //3  4  5
                    mul *= ints[i][j];       //4  5  6
                }
            }
        }
            System.out.println(sum);
            System.out.println(mul);

    }
}
