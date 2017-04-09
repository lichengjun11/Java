package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/4/9 14:43.
 */
public class StringTest2 {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Test";
        char[] chars = {'h','e','l','l','o'};
       String s2 = new String(chars);  // 将字符转换为字符串
        System.out.println(s2);
        for (char c : s2.toCharArray()) {
            System.out.println(c);   //  将字符串转化为字符
        }
    }
}
