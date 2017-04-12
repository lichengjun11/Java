package java1702.javase.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Li chengjun
 * on 2017/4/12 9:58.
 */
// 按元素值排序
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("a",3);
        map.put("bc",4);
        map.put("bde",8);
        map.put("bde",6);
        map.put("qqw",null);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-->"+ entry.getValue());
        }
        System.out.println(map.ceilingEntry("bc"));
        System.out.println(map.ceilingKey("bde"));
    }
}
