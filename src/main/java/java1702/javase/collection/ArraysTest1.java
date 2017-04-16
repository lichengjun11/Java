package java1702.javase.collection;

import java.util.*;

/**
 * Created by Li chengjun
 * on 2017/4/16 16:18.
 */
public class ArraysTest1 {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("1");
        strings.add("c");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        List<String> list = new ArrayList<>();
        list.addAll(strings);
        System.out.println(list);
        Collections.reverse(list);// 倒序输出
        System.out.println(list);

    }
}
