package java1702.javase.collection;

import java.util.*;

/**
 * Created by Li chengjun
 * on 2017/4/12 20:54.
 */
public class IteratorTest1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        TreeSet<String> strings = new TreeSet<>();
        strings.add("c");
        strings.add("b");
        strings.add("a");
        Iterator<String> iterator1 = strings.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("-------");

        HashMap<Integer,String> map = new HashMap<>();
        map.put(13,"大王");
        map.put(210,"小王");
        Iterator<Integer> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            Integer next = iterator2.next();
            System.out.println(next + "---->" + map.get(next) );
        }
    }
}
