package java1702.javase.collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Li chengjun
 * on 2017/4/12 11:33.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            listIterator.add("qq");
            String next = listIterator.next();
            System.out.println(next);  //  向前遍历
            listIterator.set("f");
        }
        while (listIterator.hasPrevious()){
            String previous = listIterator.previous();
            System.out.println(previous);  //   向后遍历
        }
        System.out.println(arrayList.indexOf("a"));
        System.out.println(arrayList.set(0,"zzz"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.remove(4));
    }
}
