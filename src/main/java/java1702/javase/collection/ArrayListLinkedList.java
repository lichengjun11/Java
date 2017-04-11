package java1702.javase.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Li chengjun
 * on 2017/4/11 22:35.
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add( i+"");
            linkedList.add(i + "");
        }
        long start = System.currentTimeMillis();
//            System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        long time1  = System.currentTimeMillis();

        System.out.println(linkedList.get(1));
        long time2  = System.currentTimeMillis();

        System.out.println(time1 - start);
        System.out.println(time2 - time1);

    }
}
