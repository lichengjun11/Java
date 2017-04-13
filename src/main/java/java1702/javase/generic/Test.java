package java1702.javase.generic;

import java.util.Date;

/**
 * Created by Li chengjun
 * on 2017/4/13 8:53.
 */
// T Type 类型
public class Test<T> {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1,2));
        System.out.println(test.concat(1.5,2.0));
        System.out.println(test.concat(new Date(),new Date()));

    }
    private String concat(T x,T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
