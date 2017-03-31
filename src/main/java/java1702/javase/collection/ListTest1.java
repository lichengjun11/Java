package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/3/31 16:53.
 */
public class ListTest1 {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("hi");
    list.add("hello");
    list.add("hello");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.contains("teat"));
        System.out.println(list.indexOf("hello"));
        System.out.println(list.lastIndexOf("hello"));

        System.out.println(list.isEmpty());
        System.out.println(list.remove(1));
        System.out.println(list.set(1,"lilili"));
        System.out.println(list.toString());

        Object[] objects = list.toArray();
        list.add("hello");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("----------");
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("hello");
        strings1.add("hi");
        strings1.add("lilili");
        list.removeAll(strings1);
        System.out.println(list.size());
        System.out.println(list);
    }

}
