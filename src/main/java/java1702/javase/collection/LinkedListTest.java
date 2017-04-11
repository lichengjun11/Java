package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by Li chengjun
 * on 2017/4/11 9:51.
 */
  // linkedList  连接列表
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
        System.out.println("----------");
        System.out.println(strings.toString());
        System.out.println(strings.clone());    //  clone 克隆

    }
}
