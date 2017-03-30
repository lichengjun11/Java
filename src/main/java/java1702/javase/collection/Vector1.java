package java1702.javase.collection;

import java.util.Vector;

/**
 * Created by Li chengjun
 * on 2017/3/30 16:57.
 */
public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
                                                //JDK5
        vector.add("hi");  // 添加
        vector.add("hello");
        vector.add("test");
        vector.add("hi");

        System.out.println(vector.size());
        System.out.println(vector.get(0));
        System.out.println(vector.remove(2));
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        for (String s : vector) {
            System.out.println(s);
        }
        Vector<Integer> integers = new Vector<>();
        integers.add(32);
        integers.add(345);
        integers.add(333);
        System.out.println(integers.size());
        System.out.println(integers.capacity());
        integers.setElementAt(66,0);  // 修改;
        integers.set(1,423); // 修改
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
