package java1702.javase.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Li chengjun
 * on 2017/4/12 10:47.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("q");
        list.add("c");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------");
        TreeSet<String> set = new TreeSet<>();
        set.add("hello");
        set.add("java");
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("-----------");
        HashMap<Integer,String> map = new HashMap<>();
       map.put(1,"good");
       map.put(5,"very");
       Iterator<Integer> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            Integer next = iterator2.next();
            System.out.println(next + "---> "+ map.get(next));
        }
    }
}
