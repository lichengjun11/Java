package java1702.javase.collection;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/3/30 16:18.
 */
public class Array1 {
    public static void main(String[] args) {
        // 1声明一个数组
    String[] aArray = new String[5];
    String[] bArray = {"a","b","c","d","e"};
    String[] cArray = new String[]{"a","b","c","d","e"};

        // 2输出一个数组
    int[] intArray = {1,2,3,4,5};
    String intArrayString = Arrays.toString(intArray);
        System.out.println(intArray);
        System.out.println(intArrayString);

        // 3检查 一个数组是否包含某个值
        String[] strings = {"a","b","c","d","e"};
      boolean b = Arrays.asList(strings).contains("a");
        System.out.println(b);
    }

}
