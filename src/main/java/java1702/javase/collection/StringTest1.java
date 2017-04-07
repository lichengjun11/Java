package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by Li chengjun
 * on 2017/4/7 14:53.
 */
public class StringTest1 {
    public static void main(String[] args) {
        System.out.println("hwwwwwwwwwwwwwwwwwwwwwwwwwello".charAt("hwwwwwwwwwwwwwwwwwwwwwwwwwello".length()-1));
        String s1 = "HELLEO";
        String s2 = "hi";
        String s3 = "hello";
        System.out.println(s1.concat(s2));//concat 连接
        System.out.println(s2.contains("h")); //contains 包含
        System.out.println(s1.endsWith("llo")); // endsWith 后缀
        System.out.println(s1.equals(s3)); // 相同
        System.out.println(s1.equalsIgnoreCase(s3)); //比较相同，但不考虑大小写
        System.out.println(Arrays.toString(s1.getBytes()));
        System.out.println(s1.indexOf('E')); // 输出索引
        System.out.println(s1.isEmpty());
        System.out.println(s1.lastIndexOf('E'));
        System.out.println(s1.length());
//        System.out.println(s1.replace("HE","AAA"));// 替换
        System.out.println(Arrays.toString(s1.split("E"))); // 分裂，分隔
        System.out.println(s1.startsWith("HE"));
        System.out.println(s1);
        System.out.println((s1.substring(1,4)));
        System.out.println(Arrays.toString(s1.toCharArray()));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println("    h i   ".trim()); // 修剪。去掉前后空格

    }
}
