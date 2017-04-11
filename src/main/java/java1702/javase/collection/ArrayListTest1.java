package java1702.javase.collection;

import com.sun.glass.ui.Size;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/4/11 8:59.
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        strings1.add("c");

        System.out.println(strings.equals(strings1));

        List<String> strings3 = new ArrayList<>(strings1.subList(1,3));
        System.out.println(strings3);
        System.out.println(strings.subList(1,2));

        System.out.println(strings3.containsAll(strings));
        System.out.println(strings1.containsAll(strings));
        System.out.println(strings1.containsAll(strings3));
        System.out.println("--------------");
//        strings1.removeAll(strings3);
//        System.out.println(strings1); // 返回不相同的那部分

        strings1.retainAll(strings3);
        System.out.println(strings1);  // 返回相同的那部分

        System.out.println(strings.removeAll(strings3));

    }
}
