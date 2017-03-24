package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/3/24 11:28.
 */
public class PrimitiveTest {
    private static void method(boolean b) {
        System.out.println("b:" + b);
        b = false;
        System.out.println("c:" + b);
    }

    public static void main(String[] args) {
        boolean b = true;
        System.out.println("a:" );
        method(b);
        System.out.println("d:" );
    }
}
