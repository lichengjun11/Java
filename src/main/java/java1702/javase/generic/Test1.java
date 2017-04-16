package java1702.javase.generic;

import java.util.Date;

/**
 * Created by Li chengjun
 * on 2017/4/15 18:43.
 */
public class Test1<T> {
    public static void main(String[] args) {
    Test1 test1 = new Test1();
        System.out.println(test1.concat(1,2));
        System.out.println(test1.concat(1.2,3.4));
        System.out.println(test1.concat(true,false));
        System.out.println(test1.concat(new Date(),new Date()));
    }
    private String concat(T x,T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
