package java1702.javase.collection;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Li chengjun
 * on 2017/4/1 14:26.
 */
public class E8 {
    public static void main(String[] args){
        int[] srcArray = {1, 2, 3, 4, 5, 6};
        int[] destArray = new int[6];

        // src - source 源\ [sɔːs]
        // dest - destination 目的地\ [,destɪ'neɪʃ\(ə\)n]
        System.out.println(Arrays.toString(srcArray));
        System.arraycopy(srcArray, 1, destArray, 3, 1);
        System.out.println(Arrays.toString(destArray));

        }

}