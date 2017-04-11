package java1702.javase.collection;

import java.util.LinkedHashSet;

/**
 * Created by Li chengjun
 * on 2017/4/11 16:10.
 */
// linkedHashSet  是有序的，不可重复的
public class LinkedSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("f");
        strings.add("g");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
