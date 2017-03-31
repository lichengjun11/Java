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

    }

}
