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

       hashtable.put(null,"ww");
       hashtable.put(12,null);  //  当键和值为null时，虽然编译不报错，但运行时报错

        System.out.println(hashtable.size());
        System.out.println(hashtable.get(123));

        System.out.println(hashtable.remove(11));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "-->" + hashtable.get(integer));   // 获取键的集合

            for (String s : hashtable.values()) {
                System.out.println(s);              //  获取值的集合
            }

            for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
                System.out.println(integerStringEntry.getKey() +"--->"+ integerStringEntry.getValue());  // 获取键和值的集合
            }
        }

    }
}
