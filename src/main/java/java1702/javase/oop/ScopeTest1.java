package java1702.javase.oop;

/**
 * Created by Li chengjun
 * on 2017/4/6 17:05.
 */
//变量的作用域范围。
public class ScopeTest1 {
   // scope 范围
    private int i;
    public void m(String s){
        System.out.println(i);
        int j = 0;//    局部变量 属于块作用域范围
        System.out.println(j);
        method();
        for (int k = 0; k < 12; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < 12; k++) {
            System.out.println(k);
        }
    }
    public void method() {

    }
}
