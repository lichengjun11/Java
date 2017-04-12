package java1702.javase.collection;

import java.util.LinkedHashMap;

/**
 * Created by Li chengjun
 * on 2017/4/12 9:35.
 */

// LinkedHashMap  有序的
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        for (Integer integer : map.keySet()) {
            System.out.println(integer + "-->" + map.get(integer));
        }

    }
}
