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
            System.out.println(s.toLowerCase());
            System.out.println(s.toUpperCase());
            System.out.println(s.concat(s1));// 连接
            String s5 = "你好";
            for (byte b : s5.getBytes()) {//字符串返回字节数组，可以进行迭代，用foreath循环
                System.out.println(b); //一个汉字返回三个字节。一个字母返回一个字节
                String s6 = "hi Hello";
                System.out.println(s6.indexOf("e")); // indexOf 返回子字符串e在s6字符串中第一次出现的索引
                s6 = "";
                System.out.println(s6.isEmpty());  // 判断是不是空字符串
                String s7 = "hi liChengJun";
                System.out.println(s7.matches("\\w+"));
                System.out.println(s7.replaceAll("\\w+","a"));
                String[] strings = s7.split("\\s"); // space 空格 \\s+
                System.out.println(strings.length);
                for (String string : strings) {
                    System.out.println(string); //  拆分字符串
                    System.out.println(s7.substring(s.indexOf("l"),s.indexOf("l")+3));// 提取一个子字符串
                    System.out.println(String.valueOf(1.223));// 把其他类型的转换为字符串
                }
            }
        }
    }
}
