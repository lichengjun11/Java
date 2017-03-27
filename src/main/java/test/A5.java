package test;

/**
 * Created by Li chengjun
 * on 2017/3/25 11:17.
 */
public class A5 {
    public static void method(int x) {
        System.out.println("b:"+ x);
        x++;
        System.out.println("c:"+ x);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a:"+ i);
        method(i);
        System.out.println("d:"+i);
    }
}
