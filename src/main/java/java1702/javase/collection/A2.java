package java1702.javase.collection;

import sun.awt.SunHints;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Li chengjun
 * on 2017/4/12 15:47.
 */
//使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
//添加几条信息
//        列出所有的员工姓名
//        列出所有员工姓名及其工资
//        删除名叫 Tom 的员工信息
//        输出 Jack 的工资，并将其工资改为 1500 元
//        将所有工资低于 1000 元的员工的工资上涨 20%
public class A2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("小张",2100);
        hashMap.put("小董",800);
        hashMap.put("Tom",900);
        hashMap.put("Jack",1200);
        hashMap.remove("Tom");
        hashMap.put("Jack",1500);
        for (String s : hashMap.keySet()) {
            System.out.println(s + "-->" + hashMap.get(s));
        }
//      for(double in: hashMap.values()){
//            if(in <= 1000){
//                in = in*1.2;
//                System.out.println( in);
//            }
//       for(double d: hashMap.values()){
//            if (d < 1000) {
//                d = d * 1.2;
//                System.out.println(d);
//            }
//      }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() < 1000){
                System.out.println(entry.getKey()+" 修改后的工资是"+ entry.getValue() * 1.2);
            }
            System.out.println(entry.getKey() + "的工资是:" + entry.getValue());
        }


        }
    }

