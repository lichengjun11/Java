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
        //运行时  totalMemory 总共的内存空间   freeMemory  空闲的内存空间
       long m1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(m1);
        for (int i = 0; i < 10000; i++) {
            arrayList.add( i+"");
            linkedList.add(i + "");
        }
        // 总共的空间减去空闲的。就是已经占用的
        long m2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(m2);
        System.out.println((m2-m1)/1024/1024);

//        long start = System.currentTimeMillis();
            System.out.println(arrayList);
//        System.out.println(arrayList.get(1));
//        long time1  = System.currentTimeMillis();
//
//        System.out.println(linkedList.get(1));
//        long time2  = System.currentTimeMillis();
//
//        System.out.println(time1 - start);
//        System.out.println(time2 - time1);

    }
}
