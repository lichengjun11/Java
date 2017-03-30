package java1702.javase.collection;

import java.util.Vector;

/**
 * Created by Li chengjun
 * on 2017/3/29 14:15.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
//        Vector<String> vector = new Vector<>();
        vector.add("hihihi");
        vector.add("test");
        vector.add("te");
        vector.add("hello");
    }
//        System.out.println(vector.get(1)); //调取其中的某一个
//        System.out.println(vector.size());//个数
//        for (String s : vector) {
//            System.out.println(s);  // foreach 循环，输出每一个
//        }
//        System.out.println(vector.capacity());//容量
//        System.out.println("--------------");
//        Vector<Integer> integers = new Vector<>();
//        integers.add(1);
//        integers.add(50);
//        integers.add(100);
//        System.out.println(integers.capacity());
//        System.out.println(integers.size());
//        integers.setElementAt(9, 0);
//        integers.setElementAt(66,1);
//        System.out.println(integers.set(2,666));
//
//        integers.remove(0);
//        System.out.println(integers.get(0));
//
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }
//    }
}
