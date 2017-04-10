package java1702.javase.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by Li chengjun
 * on 2017/4/9 22:57.
 */
public class Vector3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();  //  可以放重复元素
        vector.add("hi");
        vector.add("hello");
        vector.add("test");
        vector.add("hi");
        System.out.println(vector.get(0));
        System.out.println(vector.size());
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        Set<String> strings = new HashSet<>();      //  不可以放重复元素    set是接口
        strings.add("a");
        strings.add("aa");
        strings.add("aaaa");
        strings.add("aaaa");
        System.out.println(strings.size());

        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(91);
        integers.add(12);
        integers.add(123);
        System.out.println(integers.set(0,89));
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers.remove(3));
    }
}
