package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Li chengjun
 * on 2017/4/10 10:00.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("good");
        list.add("very");
        list.add("qwe");
//        System.out.println(list.addAll(0,list));


        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.get(1));
        System.out.println(list.contains("hi"));
//        list.clear();
        System.out.println(list.size());




    }
}
