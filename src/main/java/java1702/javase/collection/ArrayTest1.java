package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/4/10 20:13.
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> list1 = new ArrayList<>();
        list1.add("大");
        list1.add("天");
        list1.add("火");
        list1.addAll(1,list); //  将list全部添加到list1中
        System.out.println("顺序添加：" + list1);
        System.out.println(list.remove(list));
        System.out.println(list);

//        list.add(1,"E");// 在第一个元素后边添加E
//        list.add(4,"F"); // 在第三个后边添加F
//        System.out.println(list);
    }
}
