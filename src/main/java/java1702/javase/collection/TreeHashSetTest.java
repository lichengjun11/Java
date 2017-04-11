package java1702.javase.collection;

import java.util.TreeSet;

/**
 * Created by Li chengjun
 * on 2017/4/11 16:16.
 */
//TreeSet 按自然顺序进行  例如   a b c d ...
public class TreeHashSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("c");
        strings.add("a");
        strings.add("f");
        strings.add("d");
        strings.add("b");
        strings.add("e");
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
