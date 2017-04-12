package java1702.javase.collection;

import java.util.TreeMap;

/**
 * Created by Li chengjun
 * on 2017/4/12 20:12.
 */
// 编写一个程序，让TreeMap的value值 也不能为空
public class MyTreeMap<k,v> extends TreeMap<k,v>{
    @Override
    public v put(k key, v value) {
        if( value == null){
            throw new NullPointerException();
        }
        return super.put(key, value);
    }

    public static void main(String[] args) {
        MyTreeMap<Integer,String> treeMap = new MyTreeMap<>();
        treeMap.put(1,null);
    }
}
