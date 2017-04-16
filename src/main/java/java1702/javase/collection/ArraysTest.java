package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/4/16 14:51.
 */
public class ArraysTest {
    public static void main(String[] args) {
        String[] strings={"a","b","c","e","d"};
        System.out.println(Arrays.toString(strings));
        // 二分搜索法
        System.out.println(Arrays.binarySearch(strings,"c"));// 返回数组下标


        // copyof  再复制一个新的数组 到指定的索引结束
        String[] strings1 = Arrays.copyOf(strings,2);
        System.out.println(Arrays.toString(strings1));
        // copyofrange 自己设定起始索引，自己设定终止索引
        String[] strings2= Arrays.copyOfRange(strings,1,3);
        System.out.println(Arrays.toString(strings2));

        // sort 按元素自然顺序排列
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
