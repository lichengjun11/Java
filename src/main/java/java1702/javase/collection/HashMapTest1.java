package java1702.javase.collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Li chengjun
 * on 2017/4/12 18:59.
 */
public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("cn","中国");
        map.put("us","美国");
        map.put("en","英国");

        System.out.println(map);
        System.out.println("cn" + map.get("cn"));  // 输出cn 中国
        System.out.println(map.containsKey("cn")); // Map 是否包含这个键
        System.out.println(map.keySet());  //  输出所有的键
        System.out.println(map.isEmpty());  // 查看map 是否为空

        map.remove("cn");
        System.out.println(map.containsKey("cn"));

        // 使用iterator遍历HashMap
        Iterator iterator = map.keySet().iterator();
        // Map.ketSet() 返回的是一个set，set上面有iterable接口
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
            System.out.println(map.get(next));
        }
    }
}
