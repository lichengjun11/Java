package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/7 8:58.
 */

// 参数传递
public class ParameterPassTest {
    private static void test(boolean b) {
        System.out.println("b:"+ b);
        b = true;
        System.out.println("c:"+ b);
    }
    public static void main(String[] args) {
        boolean c = false;
        System.out.println("a:"+c);
        test(c);
        System.out.println("d:"+ c);
    }
}
