package java1702.javase.collection;

import java.util.ArrayList;

/**
 * Created by Li chengjun
 * on 2017/3/31 14:03.
 */
public class ListTest extends Array{
    public static void main(String[] args) {
        //        Iterable 可迭代的
        //        Collection 集合
        //        List 列表
        //        Set 集合
        //        Map 映射
        //        Vector
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hello");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains("hell"));
        System.out.println(arrayList.indexOf("hello"));
        System.out.println(arrayList.lastIndexOf("hello"));
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.set(1,"test"));
        System.out.println(arrayList.isEmpty());
//        arrayList.clear();
        arrayList.ensureCapacity(20);
        arrayList.trimToSize();
        System.out.println(arrayList.isEmpty());
        System.out.println("--->" + arrayList);
        Object[] objects = arrayList.toArray();


        }

    }

