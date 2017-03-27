package java1702.javase.oop;

import java.util.Calendar;

/**
 * Created by Li chengjun
 * on 2017/3/24 11:28.
 */
public class PrimitiveTest {


    private static void method(int j ) {
        System.out.println("b:" +j);
       int i = 8;
        System.out.println("c:" +i);
//        System.out.println("b:" + primitiveTest.s);
//        primitiveTest.s = "hi";
//        System.out.println("c:" + primitiveTest.s);
    }

    public static void main(String[] args) {
    int j = 4;
        System.out.println("a:"+j);//基本数据类型中，方法中的改变不会影响实际参数
        method(j);
        System.out.println("d:"+j);// 引用数据类型中，方法中的改变会影响实际参数
//        PrimitiveTest primitiveTest = new PrimitiveTest();
//        primitiveTest.s = "hello";
//        System.out.println("a:" + primitiveTest.s);
//        method(primitiveTest);
//        System.out.println("d:"+ primitiveTest.s );
    }
}
