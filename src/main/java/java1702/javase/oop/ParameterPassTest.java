package java1702.javase.oop;

import java.security.PublicKey;

/**
 * Created by Li chengjun
 * on 2017/4/7 8:58.
 */

// 参数传递
public class ParameterPassTest {
    private String s;
    public static void test(ParameterPassTest x) {
        System.out.println("b:"+ x.s);
        x.s = "hello";
        System.out.println("c:" + x.s);
    }
    public static void main(String[] args) {
    ParameterPassTest parameterPassTest = new ParameterPassTest();
        System.out.println("a:"+ parameterPassTest.s);
        test(parameterPassTest);
        System.out.println("d:"+ parameterPassTest.s);
    }




//    private static void test(String a) {
//        System.out.println("b:"+a);
//        a = "hi";
//        System.out.println("c:"+ a);
//    }
//    public static void main(String[] args) {
//        String s = "hello";
//        System.out.println("a:"+ s);
//        test(s);
//        System.out.println("d:"+ s);
//    }

}
