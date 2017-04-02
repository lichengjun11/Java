package java1702.javase.collection;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/4/1 14:26.
 */
public class E8 {
    public static void main(String[] args){
   int[] ints = {3,4,6};
   int chengji = 1;
        System.out.println("一维数组中各元素的乘积是：");
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.print(ints[i]+"=");
            } else {
                System.out.print(ints[i]+"*");
            }
            chengji = chengji*ints[i];
        }
        System.out.println(chengji);
        }

}