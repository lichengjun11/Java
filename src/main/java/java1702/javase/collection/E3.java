package java1702.javase.collection;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.search;

/**
 * Created by Li chengjun
 * on 2017/4/1 14:33.
 */
//使用键盘录入一个字符串，获取字符串中每一个字符出现的次数，要求统计结果格式为：a(5),b(4),c(3),d(2),e(1)
public class E3 {
    public static void main(String[] args) {
   String s1 = "adfbgavvgb ";
   String s2 = "a";
        System.out.println("a"+search(s1,s2)+",");
    }
    public static int search(String s1,String s2) {
        int a = s1.length();
        int b = s1.replaceAll(s1,"").length();
        return a-b;
    }
}

