package java1702.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Li chengjun
 * on 2017/4/16 13:02.
 */
//使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
//添加几条信息
//        列出所有的员工姓名
//        列出所有员工姓名及其工资
//        删除名叫 Tom 的员工信息
//        输出 Jack 的工资，并将其工资改为 1500 元
//        将所有工资低于 1000 元的员工的工资上涨 20%
public class A2_2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Tom",2000);
        map.put("Jack",1800);
        map.put("Jerry",800);
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
        map.remove("Tom");
        System.out.println(map);
        map.put("Jack",1500);
        System.out.println(map);

        for (Map.Entry<String, Integer> integerEntry : map.entrySet()) {
            if(integerEntry.getValue() <1000){
                System.out.println(integerEntry.getKey()+"上涨后的工资是："+integerEntry.getValue()*1.2);
            }
        }
    }
}
