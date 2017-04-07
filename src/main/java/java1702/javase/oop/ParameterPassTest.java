package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/7 8:58.
 */

// 参数传递
public class ParameterPassTest {
    private static void test(String a) {
        System.out.println("b:"+a);
        a = "hi";
        System.out.println("c:"+ a);
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("a:"+ s);
        test(s);
        System.out.println("d:"+ s);
    }
//    private static void test(boolean b) {
//        System.out.println("b:"+ b);
//        b = true;
//        System.out.println("c:"+ b);
//    }
//    public static void main(String[] args) {
//        boolean c = false;
//        System.out.println("a:"+c);
//        test(c);
//        System.out.println("d:"+ c);
//    }
}
