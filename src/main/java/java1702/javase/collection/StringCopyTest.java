package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/3/31 9:50.
 */
public class StringCopyTest {
    public static void main(String[] args) {
        int[] srcArray1 = {1,2,3,4,5};
        int[] destArray = new int[10];
        String[] srcArray = {"a","b","c","d","null","null","null","null","null"};
        System.out.println(Arrays.toString(srcArray));
        System.arraycopy(srcArray,2,destArray,3,1);
        for (String s : srcArray) {
            System.out.println(s);
        }
    }
}
