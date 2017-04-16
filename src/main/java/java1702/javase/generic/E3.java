package java1702.javase.generic;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by Li chengjun
 * on 2017/4/15 9:40.
 */
//拆分字符串，字符串中含有逗号和数字，对数字排序并输出
//例如：String s0=”123,45,25,85”;
//        输出：25 45 85 123
public class E3 {
    public static void main(String[] args) {
        String s0 = "123,45,25,85";
        String[] strings = s0.split(",");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
