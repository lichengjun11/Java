package java1702.javase.collection;

import java.util.Vector;

/**
 * Created by Li chengjun
 * on 2017/4/8 9:52.
 */
public class Vector2 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(": Hello");
        }
        System.out.println(vector.add("hello"));
        System.out.println(vector.add("hi"));
        vector.add(1,"nihao");
        System.out.println(vector);
        System.out.println(vector.size());      //      大小
        System.out.println(vector.capacity());      //   容量
        System.out.println(vector.get(0));
    }
}
