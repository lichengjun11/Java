package java1702.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/4/10 16:10.
 */
// 遍历ArrayList
public class Collection2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHA");
        // 第一种遍历方法使用foreach遍历list
        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {
        }
            System.out.println(list);

            // Iterator  迭代器
        // 第二种遍历  使用迭代器进行相关遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
