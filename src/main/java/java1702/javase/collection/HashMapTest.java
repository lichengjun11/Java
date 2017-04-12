package java1702.javase.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Li chengjun
 * on 2017/4/12 9:01.
 */

//  无序的
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"aa");
        map.put(2,"bb");
        map.put(10,"cc");
        map.put(100,"dd");
        map.put(null,"e");
        map.put(3,null);  //  HashMap中键和值都可以为空

        System.out.println(map.size());
        for (Integer integer : map.keySet()) {
            System.out.println(integer + "--->" + map.get(integer));
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() +">"+ integerStringEntry.getValue());
        }

            System.out.println(map.clone());
        System.out.println(map.entrySet());
        System.out.println(map.get(105));

    }
}
