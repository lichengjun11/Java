package java1702.javase.collection;

import java.util.Hashtable;

/**
 * Created by Li chengjun
 * on 2017/3/29 15:34.
 */
public class HashtableTest {
    public static void main(String[] args) {
        // k  key 键     v  value  值
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(4,"nihao");
        hashtable.put(6,"hello");
        System.out.println(hashtable.get(4));
    }
}
