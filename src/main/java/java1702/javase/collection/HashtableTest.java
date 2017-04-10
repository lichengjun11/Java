package java1702.javase.collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Li chengjun
 * on 2017/3/29 15:34.
 */
public class HashtableTest {
    public static void main(String[] args) {
       Hashtable<Integer,String> hashtable = new Hashtable<>();
       hashtable.put(1,"hi");
       hashtable.put(11,"hello");
       hashtable.put(123,"你好");
       hashtable.put(3,"good");

        System.out.println(hashtable.size());
        System.out.println(hashtable.get(123));

        System.out.println(hashtable.remove(11));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "-->" + hashtable.get(integer));   // ?

            for (String s : hashtable.values()) {
                System.out.println(s);
            }

            for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
                System.out.println(integerStringEntry.getKey() +"--->"+ integerStringEntry.getValue());
            }
        }

    }
}
