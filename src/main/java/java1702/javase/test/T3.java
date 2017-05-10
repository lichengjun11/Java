package java1702.javase.test;

import java1702.javase.collection.Array;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/5/10 11:18.
 */
//  拆分字符串，字符串中含有逗号和数字，对数字排序并输出
    // 例如： string  s0 = “123，45，25，85”；
    // 输出 : 25 45 85 123
    // sort
public class T3 {
    public static void main(String[] args) {
        String s = "123,45,25,85";
//        String[] c = s.split(",");  // 拆分字符串，转换成字符串数组
//        int[] ints = new int[c.length];     // 做一个整形的数组
//        for (int i = 0; i < c.length; i++) {
//            ints[i] = Integer.parseInt(c[i]);// 给字符串做循环，都转换成整数
//        }
//        Arrays.sort(ints); // 进行排序
//        for (int anInt : ints) {
//            System.out.print(anInt + " ");
//        }
//        System.out.println(Arrays.toString(ints));
        String[] c = s.split(",");
        int[] i = new int[c.length];
        for (int j = 0; j < c.length; j++) {
            i[j] = Integer.parseInt(c[j]);
        }
        Arrays.sort(i);
        System.out.println(Arrays.toString(i));
    }
}
