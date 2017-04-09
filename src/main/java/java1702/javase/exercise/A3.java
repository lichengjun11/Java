package java1702.javase.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Li chengjun
 * on 2017/4/8 14:43.
 */
//编写一个java应用程序，要求如下：
//　　//（1）声明一个String类的变量并初始化值“Hello World”。
//        　　（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
//        　　（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
//        　　（4）声明一个String类的变量并初始化值“20100110”。
//        　　（5）将上面变量的值转换成2010年1月10日的形式打印输出
public class A3 {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] s2 = s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println("Hello".toUpperCase());
        System.out.println("World".toLowerCase());

        String s1 = "20100110";
        try{
            Date date = new SimpleDateFormat("yyyyMMdd").parse(s1);
            System.out.println(new SimpleDateFormat("yyyy年MM月dd日").format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
