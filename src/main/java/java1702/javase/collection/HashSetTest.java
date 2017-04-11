package java1702.javase.collection;

import java.util.HashSet;

/**
 * Created by Li chengjun
 * on 2017/4/11 15:54.
 */
// set 方法是无序的，不可重复的
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        strings.add("test");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
