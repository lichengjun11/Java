package java1702.javase.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Li chengjun
 * on 2017/4/27 9:17.
 */
//  正则表达式
public class Test {
    public static void main(String[] args) {
        //  Pattern  模式
        //  Matcher  匹配
        System.out.println(Pattern.CASE_INSENSITIVE);  // 实现大小写通用
        Pattern pattern = Pattern.compile("L",Pattern.CASE_INSENSITIVE); // pattern的静态方法
        Pattern pattern1 = Pattern.compile("(?i)L"); // ？i  也能实现大小写匹配
        Pattern pattern2 = Pattern.compile("\\p{ASCII}");
        Matcher matcher = pattern2.matcher("heLLO");
//        System.out.println(matcher.find());
        while(matcher.find()){
            System.out.println(matcher.group()); //  group 方法返回捕获的字符串
        }
    }
}
