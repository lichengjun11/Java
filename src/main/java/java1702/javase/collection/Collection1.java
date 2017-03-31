package java1702.javase.collection;

import java.util.ArrayList;

/**
 * Created by Li chengjun
 * on 2017/3/31 11:43.
 */
public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("456");
        arrayList.add("123asdf");
        arrayList.add("niyit");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
    }
    }

