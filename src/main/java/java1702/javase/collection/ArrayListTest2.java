package java1702.javase.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Li chengjun
 * on 2017/4/11 20:31.
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList =  new ArrayList<>();
        arrayList.add("java");
        arrayList.add("web");
        arrayList.add("abc");

        ArrayList<String> arrayList1 =  new ArrayList<>();
        arrayList1.add("java");
        arrayList1.add("abc");
        arrayList1.add("web");
//        System.out.println(arrayList.addAll(arrayList));
        System.out.println(arrayList.contains("a"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.indexOf("web"));
        System.out.println(arrayList.lastIndexOf("web"));
        System.out.println(Arrays.toString(arrayList.toArray()));
        System.out.println(arrayList.size());
        arrayList.trimToSize(); // 将capacity 变成 size 大小

        System.out.println(arrayList.equals(arrayList1));

        List<String> strings3 = arrayList.subList(1,3);
        System.out.println(strings3);
        System.out.println(arrayList.subList(0,1));
        System.out.println(arrayList.containsAll(strings3));

//        arrayList.removeAll(strings3);
//        System.out.println(arrayList);  //  返回arrayList和strings3 不重复的那部分

          arrayList.retainAll(strings3);
        System.out.println(arrayList);  // 返回arrayList 和strings3 重复的那部分

    }
}
