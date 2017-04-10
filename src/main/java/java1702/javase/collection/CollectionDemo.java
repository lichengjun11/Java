package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/4/10 15:44.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        String a = "a",b = "b", c = "c", d = "d",apple = "apple"; //要添加到集合中的对象
        List<String> list = new ArrayList<>();// 创建list集合对象
        list.add(a);
        list.add(apple);
        list.add(b);
        list.add(b);
        list.add(apple);
        list.add(c);
        list.add(apple);
        list.add(d);
        list.add("e");
        System.out.println(list);// 输出列表中的全部元素
        for (String s : list) {
            System.out.println("---"+ s);
        }

        System.out.println("apple第一次出现的索引位置是：" + list.indexOf(apple));
        System.out.println("b最后一次出现的索引位置是：" + list.lastIndexOf(b));
    }
}
