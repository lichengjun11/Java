package java1702.javase.generic;

import java.util.Vector;

/**
 * Created by Li chengjun
 * on 2017/4/13 10:01.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("123");
        vector.add("yi");
        vector.add("test");
        vector.add("er");
//        System.out.println(vector.get(1));
        String s =  vector.get(0);
        System.out.println(s);

    }
}
